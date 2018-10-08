package com.ctsi.yiqibao.user.controller;

import com.ctsi.yiqibao.user.pojo.User;
import com.ctsi.yiqibao.user.service.UserService;
import com.ctsi.yiqibao.util.HttpUrlConnectionUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 用户相关controller
 */
@RestController
@RequestMapping("Api/user/")
public class UserController {
    //private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private Environment env;
    /**
     * 返回openid
     * @return
     */
    @GetMapping("get_weixin_sns_info")
    public JSONObject getUser(@RequestParam String code){
        //logger.info("===========================进入get_weixin_sns_info，传入参数为："+code+"============================");
        String path = "https://api.weixin.qq.com/sns/jscode2session?appid="+env.getProperty("wx_appid")+"&secret="+env.getProperty("wx_secret")+"&js_code="+code+"&grant_type=authorization_code";
        Object o = HttpUrlConnectionUtil.opentConnection(path);
        JSONObject  myJson = JSONObject.fromObject(o.toString());
        /*JSONObject openIdJson = new JSONObject();
        openIdJson.put("openid",myJson.get("openid"));*/
        //logger.info("=============================访问结束，返回值为："+myJson+"======================================");
        return myJson;
    }

    /**
     * 返回status，1正常，0异常
     */
    @GetMapping("get_user_info")
    public JSONObject get_user_info(User user){
        //1.查询用户是否存在
        //2.若不存在，插入用户信息
        //3.若存在，修改用户name等（除openid）信息
        //4.返回status=1，返回传入user信息
        User user1 = userService.getUser(user.getOpen_id());
        JSONObject resultJson = new JSONObject();
        if (user1 == null){
            int i = userService.insertUser(user);
            user.setQx("9");
            if(i<=0){
                resultJson.put("status",0);
                return resultJson;
            }
        }else{
            int i =  userService.updateUserByOpenId(user);
            user.setQx(user1.getQx());
            if(i<=0){
                resultJson.put("status",0);
                return resultJson;
            }
        }
        user.setId(user1.getId());
        String path = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+env.getProperty("wx_appid")+"&secret="+env.getProperty("wx_secret");
        Object o = HttpUrlConnectionUtil.opentConnection(path);
        System.out.println(o);
        resultJson.put("status",1);
        resultJson.put("user_info",user);
        resultJson.put("access_token",JSONObject.fromObject(o.toString()).get("access_token"));
        return resultJson;
    }
}

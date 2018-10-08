package com.ctsi.yiqibao.index.controller;

import com.ctsi.yiqibao.index.service.IndexService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 首页相关controller
 */
@RestController
@RequestMapping("Api/index/")
public class IndexController {
    @Autowired
    private IndexService indexService;

    /**
     * 查询轮播图集合
     * @return
     */
    @GetMapping("getLbt")
    public JSONObject getLbt(){
        JSONObject resultJson = new JSONObject();
        resultJson.put("status",1);
        resultJson.put("lbt_list",indexService.getLbt());
        return resultJson;
    }
    /**
     * 查询分类图集合
     * @return
     */
    @GetMapping("getFlt")
    public JSONObject getFlt(){
        JSONObject resultJson = new JSONObject();
        resultJson.put("status",1);
        resultJson.put("flt_list",indexService.getFlt());
        return resultJson;
    }
    /**
     * @作者: 段聪祺
     * @功能描述: 首页分类导航
     * @时间: 2018/10/8 14:38
     * @参数:  * @param
     * @返回值: net.sf.json.JSONObject
     **/
    @GetMapping("getClassification")
    public JSONObject getClassification(){
        JSONObject resultJson = new JSONObject();
        Map<String,Object> map = new HashMap<String,Object>();
        List list = new ArrayList();
        map.put("yfl","互联网服务");
        map.put("efl","行业解决方案");
        list.add("零售行业");
        list.add("视频互动");
        list.add("金融保险");
        map.put("data",list);
        resultJson.putAll(map);
        return resultJson;
    }

}

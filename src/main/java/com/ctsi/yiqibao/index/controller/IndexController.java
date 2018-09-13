package com.ctsi.yiqibao.index.controller;

import com.ctsi.yiqibao.index.pojo.ImageLocation;
import com.ctsi.yiqibao.index.service.IndexService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * 查询轮播图集合
     * @return
     */
    @GetMapping("getFlt")
    public JSONObject getFlt(){
        JSONObject resultJson = new JSONObject();
        resultJson.put("status",1);
        resultJson.put("flt_list",indexService.getFlt());
        return resultJson;
    }

}

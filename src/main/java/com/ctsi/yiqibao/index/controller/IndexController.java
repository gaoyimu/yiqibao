package com.ctsi.yiqibao.index.controller;

import com.ctsi.yiqibao.index.pojo.ImageLocation;
import com.ctsi.yiqibao.index.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("getLbt")
    public List<ImageLocation> getLbt(){
        return indexService.getLbt();
    }
}

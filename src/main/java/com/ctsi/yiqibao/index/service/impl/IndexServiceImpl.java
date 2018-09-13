package com.ctsi.yiqibao.index.service.impl;

import com.ctsi.yiqibao.index.mapper.IndexMapper;
import com.ctsi.yiqibao.index.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexMapper indexMapper;
    @Override
    public List getLbt() {
        return indexMapper.getLbt();
    }

    @Override
    public List getFlt() {
        return indexMapper.getFlt();
    }
}

package com.taotao.service.impl;

import com.taotao.dao.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public String queryNow(){
        //注入了Dao
        //调用Dao方法的方法 返回
        return testMapper.queryNow();
    }
}

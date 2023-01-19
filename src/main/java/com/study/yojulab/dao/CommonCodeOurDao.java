package com.study.yojulab.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonCodeOurDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList(){
        String sqlMapId = "CommonCodeOur.selectListByUID";
        Object dataMap = null;
        Object result = sqlSessionTemplate.selectList(sqlMapId,dataMap);
        return result;
    }
}

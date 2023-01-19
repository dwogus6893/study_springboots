package com.study.yojulab.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class CommonCodeDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    public Object getList() {
        String statement;
        statement = "CommonCode.selectCommon_Code_idNameOrder_Number";
        Object object = sqlSessionTemplate.selectList(statement);
        return object;
    }
}
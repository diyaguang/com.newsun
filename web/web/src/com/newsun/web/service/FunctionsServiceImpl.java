package com.newsun.web.service;

import com.newsun.web.domain.FunctionsDao;
import com.newsun.web.entity.FunctionsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: diyaguang
 * @date: 2017/09/23 下午4:48
 * @description: com.newsun.web.service
 */
@Service("functionsService")
public class FunctionsServiceImpl implements FunctionsService {

    @Autowired
    public FunctionsDao functionsDao;

    public List<FunctionsEntity> getAllFunctions(){
        return functionsDao.getAll();
    }
    public List<FunctionsEntity> getUserFunctions(String userId){
        return null;
    }
    public void saveFunctions(FunctionsEntity functionsEntity){
        functionsDao.save(functionsEntity);
    }
    public FunctionsEntity getById(String functionId) {
        return functionsDao.get(functionId);
    }
}

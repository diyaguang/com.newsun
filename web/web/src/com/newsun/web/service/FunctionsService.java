package com.newsun.web.service;

import com.newsun.web.entity.FunctionsEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: diyaguang
 * @date: 2017/09/23 下午3:54
 * @description: com.newsun.web.service
 */
@Service("functionsService")
public interface FunctionsService {
    public List<FunctionsEntity> getAllFunctions();
    public List<FunctionsEntity> getUserFunctions(String userId);
    public void saveFunctions(FunctionsEntity functionsEntity);
    public FunctionsEntity getById(String functionId);
}

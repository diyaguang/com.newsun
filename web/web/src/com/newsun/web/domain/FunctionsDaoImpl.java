package com.newsun.web.domain;

import com.newsun.web.entity.FunctionsEntity;
import com.newsun.web.entity.UsersEntity;
import org.springframework.stereotype.Repository;

/**
 * @author: diyaguang
 * @date: 2017/09/23 下午3:43
 * @description: com.newsun.web.domain
 */
@Repository("functionsDao")
public class FunctionsDaoImpl extends BaseRepositoryImpl<FunctionsEntity,String> implements FunctionsDao{
}

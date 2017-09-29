package com.newsun.web.webEntity;

import java.util.List;

/**
 * @author: diyaguang
 * @date: 2017/09/26 上午10:15
 * @description: com.newsun.web.webEntity
 */
public class PagePathEntity {
    String pathName = "";
    String pathUrl = "";

    public PagePathEntity(String tmpPathName,String tmpPathUrl){
        this.pathName = tmpPathName;
        this.pathUrl = tmpPathUrl;
    }

    public String getPathName(){return this.pathName;}
    public void setPathName(String tmpPathName){this.pathName = tmpPathName;}
    public String getPathUrl(){return this.pathUrl;}
    public void setPathUrl(String tmpPathUrl){this.pathUrl = tmpPathUrl;}
}

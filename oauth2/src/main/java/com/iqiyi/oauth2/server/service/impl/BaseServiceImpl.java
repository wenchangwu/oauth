package com.iqiyi.oauth2.server.service.impl;

import java.io.Serializable;
import java.util.List;

import com.iqiyi.oauth2.server.dao.BaseDao;
import com.iqiyi.oauth2.server.service.BaseService;

/**
 * 
 * @Title: BaseServiceImpl.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * Service业务处理接口实现，所以Service实现均继承此
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2012-09-19 上午10:58:48
 * @author shuhuan@qiyi.com
 */
public class BaseServiceImpl implements BaseService {
	
	private BaseDao dao;
	/**
     * @see org.appfuse.service.Manager#getObject(java.lang.Class, java.io.Serializable)
     */
    public Object getObject(Class<Object> clazz, Serializable id) {
        return dao.getObject(clazz, id);
    }
    
    /**
     * @see org.appfuse.service.Manager#getObjects(java.lang.Class)
     */
    public List<Object> getObjects(Class<Object> clazz) {
        return dao.getObjects(clazz);
    }
    
    /**
     * @see org.appfuse.service.Manager#removeObject(java.lang.Class, java.io.Serializable)
     */
    public void removeObject(Class<Object> clazz, Serializable id) {
        dao.removeObject(clazz, id);
    }
    
    /**
     * @see org.appfuse.service.Manager#saveObject(java.lang.Object)
     */
    public void saveObject(Object o) {
        dao.saveObject(o);
    }
    
    /**
     * @param str
     * @return boolean
     */
    public boolean isNullOrSpace(String str) {
        if(str != null && !str.trim().equals("") && !str.trim().equals("null")){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * @param o
     * @return boolean
     */
    public boolean isNullOrSpace(Object o){
        if(o != null && !o.toString().equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    /**     
     * 新建实例     
     *     
     * @param className     
     *            类名     
     * @return 新建的实例     
     * @throws Exception     
     */ 
	public Object newInstance(String className) throws Exception {       
        Class newoneClass = Class.forName(className);       
        return newoneClass.newInstance();       
    }  

}

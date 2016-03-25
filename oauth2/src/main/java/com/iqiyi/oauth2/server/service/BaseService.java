package com.iqiyi.oauth2.server.service;

import java.io.Serializable;
import java.util.List;

/**
 * BaseService业务处理接口，所有Service接口需要继承此接口
 * 
 * @author shuhuan@qiyi.com
 * @date   2012-09-19
 */
public interface BaseService {
    
    /**
     * Generic method used to get a all objects of a particular type. 
     * @param clazz the type of objects 
     * @return List of populated objects
     */
    public List<Object> getObjects(Class<Object> clazz);
    
    /**
     * Generic method to get an object based on class and identifier. 
     * 
     * @param clazz model class to lookup
     * @param id the identifier (primary key) of the class
     * @return a populated object 
     * @see org.springframework.orm.ObjectRetrievalFailureException
     */
    public Object getObject(Class<Object> clazz, Serializable id);

    /**
     * Generic method to save an object.
     * @param o the object to save
     */
    public void saveObject(Object o);

    /**
     * Generic method to delete an object based on class and id
     * @param clazz model class to lookup
     * @param id the identifier of the class
     */
    public void removeObject(Class<Object> clazz, Serializable id);
}


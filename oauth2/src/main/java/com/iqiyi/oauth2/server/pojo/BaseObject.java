package com.iqiyi.oauth2.server.pojo;

import java.io.Serializable;

/**
 * Base class for Model objects.  Child objects should implement toString(), 
 * equals() and hashCode();
 *
 * BaseObject,所有POJO都要继承此
 * 
 * @author shuhuan@qiyi.com
 */
@SuppressWarnings("serial")
public abstract class BaseObject implements Serializable {    
   
	public abstract String toString();
	
    public abstract boolean equals(Object o);
    
    public abstract int hashCode();
}

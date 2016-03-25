package com.iqiyi.oauth2.dbrw.spilitting;

import org.springframework.util.Assert;

/**
 * 数据库读写分离
 * 
 * @author shuhuan@qiyi.com
 * @date 2012-09-28
 *
 */
public class DataSourceSwitch {
	@SuppressWarnings("rawtypes")
	private static final ThreadLocal contextHolder = new ThreadLocal();
	
	@SuppressWarnings("unchecked")
	public static void setDataSource(String dataSource) {   
        Assert.notNull(dataSource, "数据源未创建成功!");   
        contextHolder.set(dataSource);   
    } 
	
	@SuppressWarnings("unchecked")
	public static void setMaster() {   
        contextHolder.remove();   
        contextHolder.set("master");   
    }
	
	@SuppressWarnings("unchecked")
	public static void setSlave() {   
        contextHolder.remove();   
        contextHolder.set("slave");   
    }
	
	public static String getDataSouce(){   
        return contextHolder.get().toString();   
    }
	
	/**
	 * 检查数据源是否设置
	 * @return
	 */
	public static String checkDataSouce(){   
		if( null == contextHolder.get() ) {
			return "master";
		} else {
			return contextHolder.get().toString();
		}
    }
	
}

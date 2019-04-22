package com.jt.sys.dao;

public interface SysLogDao {
	/**
	 * 按用户名获取记录总数
	 */
	int getRowCount(String username);

}

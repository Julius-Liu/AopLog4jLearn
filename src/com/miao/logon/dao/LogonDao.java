package com.miao.logon.dao;

import bean.User;

public interface LogonDao {
	public User logon(String username,String password);
}

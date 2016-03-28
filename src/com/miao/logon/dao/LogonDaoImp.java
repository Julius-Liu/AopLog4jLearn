package com.miao.logon.dao;

import org.springframework.stereotype.Repository;

import bean.User;

@Repository("logonDao")
public class LogonDaoImp implements LogonDao {

	@Override
	public User logon(String username, String password) {
		if(null!=username && null!=password){
			User user=new User();
			user.setUserId(100001);
			user.setUserName("GuoJing");
			return user;
		}else{
			return null;
		}
	}

}

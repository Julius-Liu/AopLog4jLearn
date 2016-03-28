package com.miao.logon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.User;

import com.miao.logon.dao.LogonDao;

@Service("logonService")
public class LogonServiceImp implements LogonService {
	
	@Autowired
	private LogonDao logonDao;
	
	@Override
	public User logon(String username,String password) {
		return logonDao.logon(username, password);
	}

}

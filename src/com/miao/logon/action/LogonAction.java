package com.miao.logon.action;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import bean.User;

import com.miao.logon.service.LogonService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class LogonAction extends ActionSupport{
	
	private String username;
	private String password;
	private String reMsg;	//返回消息, 在登录成功或者失败页面显示
	
	@Autowired
	private LogonService logonService;

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		

		if(this.getUsername()==null || this.getPassword()==null){
			this.setReMsg("请输入用户名和密码!");
			return "logon";
		}
		
		
		User user=logonService.logon(this.getUsername(),this.getPassword());
		
		if(user!=null){
			//将登录信息放入session
			Map attributes = ActionContext.getContext().getSession();
			attributes.put("user", user);
			
			this.setReMsg("欢迎您："+this.getUsername());			
			return "logonSuccess";
		}
		
		this.setReMsg("用户名或者密码错误！");
		return "logon";
	}

	
	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}



	public String getReMsg() {
		return reMsg;
	}

	public void setReMsg(String reMsg) {
		this.reMsg = reMsg;
	}
	
}

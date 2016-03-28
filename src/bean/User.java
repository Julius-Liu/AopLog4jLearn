package bean;

import java.io.Serializable;

public class User {

	private long userId;
	private String userName;
	private String sex;
	private long userGroup;
	private String password;

	public User() {
		super();
	}

	public User(long userId, String userName, String sex, long userGroup) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.sex = sex;
		this.userGroup = userGroup;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(long userGroup) {
		this.userGroup = userGroup;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}

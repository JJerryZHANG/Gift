package com.MyWeb.model;

public class User {

	private String userName;
	private String password;
	private String sex;
	private String age;
	private String tag;

	public User() {

	}

	public User(String userName, String password, String sex, String age,
			 String tag) {
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.tag = tag;
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}

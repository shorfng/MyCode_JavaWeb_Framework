package com.loto.mybatis.pojo;

/**
 * <p>Author：蓝田_Loto</p>
 * <p>Date：2021-03-12 10:47</p>
 * <p>PageName：User.java</p>
 * Function：用户实体类
 */

public class User {
	private Integer id;
	private String username;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
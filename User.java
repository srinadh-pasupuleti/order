package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_details")
public class User {
	@Id
	private String userId;
	private String password;
	private String userRole;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}

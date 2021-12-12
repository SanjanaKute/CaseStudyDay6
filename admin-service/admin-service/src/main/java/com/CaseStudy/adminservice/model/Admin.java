package com.CaseStudy.adminservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection= "Admins")
public class Admin {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String userId;
	public Admin(String id, String username, String password, String userId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.userId = userId;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", userId=" + userId + "]";
	}
	
	
}

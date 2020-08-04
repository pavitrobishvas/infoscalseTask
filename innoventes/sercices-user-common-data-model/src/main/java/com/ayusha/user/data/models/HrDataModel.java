package com.ayusha.user.data.models;

import java.util.Date;


public class HrDataModel {
	
    private long id; 
	
	/** hr name **/
	private String name;

	/** hr email **/
	private String email;
	
	/** hr mobile **/
	private String mobile;

	/** hr role **/
	private String role;

	
	/** hr user name **/
	private String userName;
	
	/** hr mobile **/
	private String organization;

	/** hr password **/
	private String password;
	
	/** hr mobile **/
	private Date createdAt;

	/** hr role **/
	private Date updateAt;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}

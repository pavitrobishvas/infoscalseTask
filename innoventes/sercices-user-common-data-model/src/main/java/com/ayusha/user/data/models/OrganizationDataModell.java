package com.ayusha.user.data.models;

import java.util.Date;

public class OrganizationDataModell {
	
    private long id; 
	
	/** hr name **/
	private String name="";

	/** hr email **/
	private String webSite="";
	
	/** hr mobile **/
	private String address="";

	/** hr role **/
	private String phone="";

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

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	
	
	

}

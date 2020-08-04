package com.ayusha.user.data.models;

import java.util.List;

/**
 * 
 * @author author
 *
 */
public class LocationsUsersDataModel {
	
	/** user id **/
	private String locationId;
	
	/** locations **/
	private List<String> lstUsers;
	/**
	 * default constructor
	 */
	public LocationsUsersDataModel() {
		
	}
	/**
	 * @return the locationId
	 */
	public String getLocationId() {
		return locationId;
	}
	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	/**
	 * @return the lstUsers
	 */
	public List<String> getLstUsers() {
		return lstUsers;
	}
	/**
	 * @param lstUsers the lstUsers to set
	 */
	public void setLstUsers(List<String> lstUsers) {
		this.lstUsers = lstUsers;
	}
}

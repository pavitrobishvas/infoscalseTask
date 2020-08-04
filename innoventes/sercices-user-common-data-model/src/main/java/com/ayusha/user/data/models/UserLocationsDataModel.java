package com.ayusha.user.data.models;

import java.util.List;

/**
 * 
 * @author author
 *
 */
public class UserLocationsDataModel {
	
	/** user id **/
	private String userId;
	
	/** locations **/
	private List<String> lstLocations;
	/**
	 * default constructor
	 */
	public UserLocationsDataModel() {
		
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the lstLocations
	 */
	public List<String> getLstLocations() {
		return lstLocations;
	}
	/**
	 * @param lstLocations the lstLocations to set
	 */
	public void setLstLocations(List<String> lstLocations) {
		this.lstLocations = lstLocations;
	}
}

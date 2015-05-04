package edu.sjsu.cmpe275.group12.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="street")  	
	private String street;
	
	@Column(name="city") 
	private String city;
	
	@Column(name="state") 
	private String state;
	
	@Column(name="zip") 
	private long zip;

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state=state;
		}
	/**
	 * @return the zip
	 */
	public long getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(long zip) {
		this.zip = zip;
	}



}

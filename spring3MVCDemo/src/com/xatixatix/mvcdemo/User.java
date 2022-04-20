package com.xatixatix.mvcdemo;

import java.util.LinkedHashMap;

public class User {

	private String firstName;
	private String lastName;
	private String country;
	private String countryO;
	private String favouriteLanguage;
	private String[] operatingSystems;

	private LinkedHashMap<String, String> countryOptions;
	public User() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("HU", "Hungary");
		countryOptions.put("FR", "France");
		countryOptions.put("UK", "United Kingdom0");
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountryO() {
		return countryO;
	}

	public void setCountryO(String countryO) {
		this.countryO = countryO;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}

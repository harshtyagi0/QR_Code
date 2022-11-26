package com.qrCode.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "QR_Code")
public class QR_Data {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;

	@NonNull
	private String name;

	@NonNull
	private String city;

	@NonNull
	private String state;

	@NonNull
	private String country;

	@NonNull
	private int pinCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

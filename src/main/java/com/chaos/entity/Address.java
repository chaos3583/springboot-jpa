package com.chaos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 559552622197695760L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="province_id",nullable=false,unique=true)
	private Integer provinceId;
	
	@Column(name="province",nullable=false,unique=false)
	private String province;
	
	@Column(name="city_id",nullable=false,unique=true)
	private Integer cityId;
	
	@Column(name="city",nullable=false,unique=false)
	private String city;
	
	@Column(name="town_id",nullable=false,unique=true)
	private Integer townId;
	
	@Column(name="town",nullable=false,unique=false)
	private String town;
	
	@Column(name="street_id",nullable=false,unique=true)
	private Integer streetId;
	
	@Column(name="street",nullable=false,unique=false)
	private String street;
	
	@Column(name="allAddress",nullable=false,unique=false)
	private String allAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getTownId() {
		return townId;
	}

	public void setTownId(Integer townId) {
		this.townId = townId;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Integer getStreetId() {
		return streetId;
	}

	public void setStreetId(Integer streetId) {
		this.streetId = streetId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAllAddress() {
		return allAddress;
	}

	public void setAllAddress(String allAddress) {
		this.allAddress = allAddress;
	}
	
}

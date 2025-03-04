package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "branchcfr")
public class BranchCFR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idbranchcfr;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "address")
	private String address;
	@Column(name = "phone")
	private Long phone;
	@Column(name = "site")
	private String site;
	public BranchCFR() {
	}
	public BranchCFR(String name, String city, String address, Long phone, String site) {
	super();
	this.name = name;
	this.city = city;
	this.address = address;
	this.phone = phone;
	this.site = site;
	
	
	}
	public Long getIdbranchcfr() {
		return idbranchcfr;
	}
	public void setIdbranchcfr(Long idbranchcfr) {
	this.idbranchcfr = idbranchcfr;
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
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	
	public void setPhone(Long phone) {
	this.phone = phone;
	}
	public String getSite() {
	return site;
	}
	public void setSite(String site) {
	this.site = site;
	}
	public Long getPhone() {
		return phone;
		
	}	
	

}

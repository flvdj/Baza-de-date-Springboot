package com.example.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "travellers")

public class Travellers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_travellers;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "city")
	private String city;
	@Column(name = "cnp")
	private Long cnp;
	@Column(name = "phonenumber")
	private Long phonenumber;
	public Travellers() {
	}
	public Travellers(String name, String surname, String city, Long cnp, Long phonenumber) {
	super();
	this.name = name;
	this.surname = surname;
	this.city = city;
	this.cnp=cnp;
	this.phonenumber=phonenumber;
	}
	public Long getId_travellers() {
	return id_travellers;
	}
	public void setId_travellers(Long id_travellers) {
	this.id_travellers = id_travellers;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getSurname() {
	return surname;
	}
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public Long getCnp() {
	return cnp;
	}
	public void setCnp(Long cnp) {
	this.cnp = cnp;
	}
	public Long getPhonenumber() {
	return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
	}
}

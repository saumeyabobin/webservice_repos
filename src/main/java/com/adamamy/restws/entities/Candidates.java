package com.adamamy.restws.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Candidates {
	
	@Id
	private int cid;
	private String cname;
	private int age;
	private String city;
	private String country;
	private  String interview_dt;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getInterview_dt() {
		return interview_dt;
	}
	public void setInterview_dt(String interview_dt) {
		this.interview_dt = interview_dt;
	}


}

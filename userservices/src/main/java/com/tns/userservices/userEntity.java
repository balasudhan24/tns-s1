package com.tns.userservices;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")

public class userEntity {
	//data member
	@Id
	@Column(name="uid")
	private int uid;
	@Column(name="uname")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="amount")
	private int amount;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public userEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userEntity(int uid, String name, String city, int amount) {
		super();
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "userEntity [uid=" + uid + ", name=" + name + ", city=" + city + ", amount=" + amount + "]";
	}
	
	
	

}

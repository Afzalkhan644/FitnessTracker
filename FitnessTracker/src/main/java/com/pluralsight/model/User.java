package com.pluralsight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private Long userId;

	private String name;

	private int age;
	private Long height;
	private Long weight;
	public User() {
		super();
	}
	public int getAge() {
		return age;
	}

	public Long getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public Long getUserId() {
		return userId;
	}

	public Long getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

}

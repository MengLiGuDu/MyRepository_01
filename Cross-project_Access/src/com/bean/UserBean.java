package com.bean;

public class UserBean {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserBean(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public UserBean(String name) {
		super();
		this.name = name;
	}
	public UserBean() {
		super();
	}
}

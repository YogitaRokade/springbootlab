package com.inject.entity;

public class Trainer {
    private Integer id;
	private String name;
	
	public Trainer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Trainer() {
		super();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}
	
	
}

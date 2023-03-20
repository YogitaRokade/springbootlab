package com.inject.entity;
//class for subject information
public class Subject {

	private String subName;

	public Subject(String subName) {
		super();
		this.subName = subName;
	}

	public Subject() {
		super();
		
	}

	@Override
	public String toString() {
		return "Subject [subName=" + subName + "]";
	}
	
	
}

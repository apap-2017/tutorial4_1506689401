package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
    private String npm;
    public StudentModel(String npm, String name, double gpa) {
		super();
		this.npm = npm;
		this.name = name;
		this.gpa = gpa;
	}
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	private String name;
    private double gpa;

}

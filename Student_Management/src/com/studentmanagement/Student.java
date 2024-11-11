package com.studentmanagement;
//Oops Concepts(Encapsulation),Constructor,DataTypes and Methods Used.

//Attributes__DataTypes
public class Student {
	private String name;
	private int age;
	private double score;
	
	//Constructor
	public Student(String name,int age,double score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	//Getters And Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	//Conditional Statement USed For Calculate Grade Based ON Score
	
	public String calculateGrade() {
		if(score>=90) {
			return "A";
		}else if(score>=80) {
			return "B";
		}else if(score>=70) {
			return "C";
		}else if (score>=60) {
			return "D";
		}else {
			return "F";
		}
	}
	//(String) Method USed to Display Student Information
	public String toString() {
        return "Name: " + name + ", Age: " + age + ", Score: " + score + ", Grade: " + calculateGrade();
	}
}
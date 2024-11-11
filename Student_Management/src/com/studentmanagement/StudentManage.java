package com.studentmanagement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class StudentManage {//List of Students
	private List<Student> students=new ArrayList<>();
	//Method to add a student(Using Scanner and Exception Handling)
	public void addStudent() {
		Scanner scan=new Scanner(System.in);	
		try {
			System.out.println("Enter Student Name:");
			String name=scan.nextLine();
			System.out.println("Enter Student Age:");
			int age=scan.nextInt();
			System.out.println("Enter Student Score:");
			double score = scan.nextDouble();
            students.add(new Student(name, age, score));
            System.out.println("Student added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
        }
		scan.close();
    }
    // Method to display all students (Looping Statement)
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    // Method to search for a student by name using a Set
    public void searchStudentByName() {
        Scanner scanner = new Scanner(System.in);
        Set<String> studentNames = new HashSet<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        if (studentNames.contains(name)) {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                    return;
                }
            }
        } else {
            System.out.println("Student not found.");
        } 
    }
    
    // Method to display student grades using a Map
    
    public void displayGrades() {
        Map<String, String> studentGrades = new HashMap<>();
        
        for (Student student : students) {
            studentGrades.put(student.getName(), student.calculateGrade());
        }
        
        System.out.println("Student Grades:");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
        
      }
    
     }


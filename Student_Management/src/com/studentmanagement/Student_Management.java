package com.studentmanagement;
import java.util.Scanner;
public class Student_Management {
	    public static void main(String[] args) {
	        StudentManage manager = new StudentManage();
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;
	        while (!exit) {
	            System.out.println("Student Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student by Name");
	            System.out.println("4. Display All Student Grades");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    manager.addStudent();
	                    break;
	                case 2:
	                    manager.displayAllStudents();
	                    break;
	                case 3:
	                    manager.searchStudentByName();
	                    break;
	                case 4:
	                    manager.displayGrades();
	                    break;
	                case 5:
	                    exit = true;
	                    System.out.println("Exiting the system.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	        scanner.close();
	    }
	}
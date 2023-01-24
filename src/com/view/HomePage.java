package com.view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.controller.SMLController;

public class HomePage {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
System.out.println("Welcome to LMS"+"\n"+
"created by {Abdelrahman Ibrahem _ 22/1/2023}"+"\n"+"===================================================================================="+"\n"+"Home page"+"\n"+"====================================================================================");
SMLController.print_AllStudentData(".\\Data\\Students_Data.txt");
System.out.println("--------------------------------------------------------------------------------------");
Scanner in=new Scanner(System.in);
System.out.print("please select the required student:");
String id =in.next();
System.out.println("===================================================================================="+"\n"+"Student Details page\n"+"===================================================================================="+"\n");
System.out.println(SMLController.print_Required_Student(id));
System.out.println("------------------------------------------------------------------------------------\r\n"
		+ "Enrolled Courses:");
System.out.println(SMLController.student_course(id));
System.out.print("------------------------------------------------------------------------------------\nPlease choose from the following:\r\n"
		+ "a - Enroll in a course\r\n"
		+ "d - Unenrollfrom an existing course\r\n"
		+ "r - Replacing an existing course\r\n"
		+ "b - Back to the main page\r\n"
		+ "please select the required action:");
String action=in.next();
switch (action) {
case "a": {
	
	break;	
}case "d":{
	
	break;
}case "r": {
	
	break;	
}case "b":{
	HomePage.main(args);
	break;
}
default:
	throw new IllegalArgumentException("Unexpected value: " + action);
}


	}

}

package com.view;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.controller.SMLController;

public class HomePage {
 
	public static String id;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
System.out.println("Welcome to LMS"+"\n"+
"created by {Abdelrahman Ibrahem _ 22/1/2023}"+"\n"+"=============================================================================================================================================="+"\n"+"Home page"+"\n"+"==============================================================================================================================================");
SMLController.print_All_Student_Data();
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
Scanner in=new Scanner(System.in);
System.out.print("please select the required student:");
 id =in.next();
System.out.println("=============================================================================================================================================="+"\n"+"Student Details page\n"+"=============================================================================================================================================="+"\n");
System.out.println(SMLController.print_Required_Student(id));
System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
		+ "Enrolled Courses:");
SMLController.student_course(id);
/*System.out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nPlease choose from the following:\r\n"
		+ "a - Enroll in a course\r\n"
		+ "d - Unenrollfrom an existing course\r\n"
		+ "r - Replacing an existing course\r\n"
		+ "b - Back to the main page\r\n\n"
		+ "please select the required action:");*/
String action=in.next();
switch (action) {
case "a": {
	EnrollmentPage.main(args);
	break;	
}case "d":{
	SMLController.unEnroll_course(id);
	break;
}case "r": {
	System.out.print("Please enter the course id to be replaced:");
	String old_Course=in.next();
	SMLController.get_course_By_Id(old_Course);
	System.out.print("Please enter the required course id to replace:");
	String new_Course=in.next();
	SMLController.replace(id, old_Course, new_Course);
	System.out.println("=======================================================================================================================================================================================");
	System.out.println(SMLController.print_Required_Student(id));
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n"
			+ "Enrolled Courses:");
	SMLController.student_course(id);
	System.out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nPlease choose from the following:\r\n"
			+ "a - Enroll in a course\r\n"
			+ "d - Unenrollfrom an existing course\r\n"
			+ "r - Replacing an existing course\r\n"
			+ "b - Back to the main page\r\n\n"
			+ "please select the required action:");
	
	break;	
}case "b":{

	HomePage.main(args);
	break;
}
default:

	HomePage.main(args);
}


	}

}

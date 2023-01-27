package com.view;

import java.io.IOException;
import java.util.Scanner;

import com.controller.SMLController;

public class EnrollmentPage {

public static void main(String[] args) throws IOException {
	Scanner in=new Scanner(System.in);
	SMLController.print_All_Courses();
	System.out.println("----------------------------------------------------------------------------------------------------\r\n"
			+ "Please make one of the following:\r\n"
			+ "Enter the course id that you want to enroll the student to\r\n"
			+ "Enter b to go back to the home page\r\n"
			+ "Please select the required action:");
	String action=in.next();
	if (action.equalsIgnoreCase("b")) {
		HomePage.main(args);
	}else {
		SMLController.enroll_course(HomePage.id, Integer.parseInt(action));
	
	}
	
}
}

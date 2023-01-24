package com.controller;

import java.io.BufferedReader; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.model.Student;

public class SMLController {

	//Function to print all student data
	public static void print_AllStudentData(String filepath) {
		System.out.println("-------------------------------\r\n"+ "Student List:\r\n"+ "-------------------------------");
		File f=new File(filepath);
	    List<Student> students = new ArrayList<>();
	        BufferedReader reader = null;
	        try {
	             reader = new BufferedReader(new FileReader(f));
	            String line;
	          
                for (int i = 0; i < 5; i++) { //print first 4 student from file
                	
	            line = reader.readLine();
	            	String[] part=line.split(",");
	                students.add(new Student(part[0],part[1],part[2], part[3],part[4],part[5], part[6],null));
	                
                }
	            reader.close();
	            
	            int count=0;
               for (Student student : students) {
            	   if (count==0) {
					
            	   System.out.format("%1s %1s %17s %15s %20s %13s %10s\n", student.getId_Student(),student.getName_Student(),student.getGrade(),student.getEmail(),student.getAddress(),student.getRegion(),student.getCountry());
            	   count++;
            	   continue;
            	   }
            	   System.out.format("%1s %4s %5s %15s %5s %5s %5s\n", student.getId_Student(),student.getName_Student(),student.getGrade(),student.getEmail(),student.getAddress(),student.getRegion(),student.getCountry());
               } 
	            
	         } catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            try {
	                reader.close();
	               
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		
	}
	public static String print_Required_Student(String id) {
		File f=new File(".\\Data\\Students_Data.txt");
	    BufferedReader reader = null;
        try {
             reader = new BufferedReader(new FileReader(f));
            String line;
          
            while ((line=reader.readLine()) !=null) { 
            	
            line = reader.readLine();
            String[] part=line.split(",");
            	if (line.startsWith(id)) {
            		return"Name:"+part[1]+"      "+"Grade:"+part[2]+"       "+"Email:"+part[3];	
				}
                
            }
            reader.close();
            
        }
        catch (Exception e) {
            e.printStackTrace();
         } finally {
            try {
                reader.close();
               
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return"please enter vaild id of student";
	}
	//Function to print student course
	public static String student_course(String id) throws FileNotFoundException {
		 String resourceName = ".\\Data\\Student course details.json";
		    InputStream inputStream = new FileInputStream(resourceName);

		    JSONTokener jsonTokener = new JSONTokener(inputStream);
		    JSONObject jsonObject = new JSONObject(jsonTokener);

		    org.json.JSONArray jsonArray = jsonObject.getJSONArray(id);

		    List course = new ArrayList<>();
		    for (int i = 0; i < jsonArray.length(); i++) {
		     
		    	course.add(jsonArray.getInt(i));
		        
		       
		    }		
			File f=new File(".\\Data\\Courses_Data.csv");
		    BufferedReader reader = null;
	        try {
	             reader = new BufferedReader(new FileReader(f));
	            String line;
	          
	            while ((line=reader.readLine()) !=null) { 
	            	
	            line = reader.readLine();
	            String[] part=line.split(",");
	            for (int i = 0; i < jsonArray.length(); i++) {
	   		     
	            	if (line.startsWith(jsonArray.get(i).toString())) {
	            		
	            		return"1-"+part[0]+",     "+part[1]+",     "+part[2]+","+part[3]+",    "+part[4]+",    "+part[5]+",    "+part[6]+",";
	            		
					}
	                
	            }
	            
	            }
	            reader.close();
	            
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	         } finally {
	            try {
	                reader.close();
	               
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }	
		return"The student hasn't enrolled in any course yet.";
	}
		
	
	//search in json file 
	public static boolean search(String pathFile ,String id) throws IOException, ParseException {
		JSONParser p=new JSONParser();
		FileReader reader = new FileReader(pathFile);
		JSONArray courses=(JSONArray) p.parse(reader);
		for (int i = 0; i < courses.size(); i++)
		    if (courses.contains(i)) {
		       
		return true; 
		    }
		return false;
	}
	/*
	public static void printAll() {
		  String[] student;                                // created an array of type String
          while ((student = studentData.readNext()) != null)   //read data line by line
          {
              for (int i = 0; i < studentDetails.length; i++) {
                  Student sDetail = new Student(student[0],student[1],);
                  sDetail.setId(studentDetails[0]);
                  sDetail.setName(studentDetails[1]);
                  sDetail.setGrade(studentDetails[2]);
                  sDetail.setEmail(studentDetails[3]);
                  sDetail.setAddress(studentDetails[4]);
                  sDetail.setRegion(studentDetails[5]);
                  sDetail.setCountry(studentDetails[6]);
                  students.add(sDetail);
              }
          }
		
		
	}
	*/
}

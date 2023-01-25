package com.view;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import com.model.*;
import com.controller.*;

public class SML {

	public static void main(String[] args) throws FileNotFoundException, IOException, TransformerConfigurationException, ParserConfigurationException, SAXException, TransformerException, ParseException {
		// TODO Auto-generated method stub

		//Data_processing.replace_Dollar(".\\Data\\student-data.txt");
		//Data_processing.replace_Hash_Add_Id(".\\Data\\Students_Data.csv");
		//Data_processing.convert_Xml_To_Csv(".\\Data\\coursedata.xml");
		
		SMLController.print_AllStudentData(".\\Data\\Students_Data.csv");
		//System.out.println(SMLController.search(".\\Data\\string-to-json-online.json", "1"));
		
		/*
		 String resourceName = ".\\Data\\Student course details.json";
		    InputStream inputStream = new FileInputStream(resourceName);

		    JSONTokener jsonTokener = new JSONTokener(inputStream);
		    JSONObject jsonObject = new JSONObject(jsonTokener);

		    // Get the array named lorem from the main object
		    JSONArray jsonArray = jsonObject.getJSONArray("1");

		    // Iterate through the array and get every element by index
		    List course = new ArrayList<>();
		    for (int i = 0; i < jsonArray.length(); i++) {
		       // JSONObject object = jsonArray.getJSONObject(i);
		    	course.add(jsonArray.getInt(i));
		        System.out.println("ipsum:" + jsonArray.getInt(i));
		       // System.out.println("sit:" + object.get("sit"));
		        //System.out.println("consectetur:" + object.get("consectetur"));
		    }		
		    for (int i = 0; i < course.size(); i++) {
				System.out.println(course.get(i));
			}
			*/
	}

}

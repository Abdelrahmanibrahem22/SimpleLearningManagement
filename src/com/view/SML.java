package com.view;
import java.io.FileNotFoundException; 
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;
import com.controller.*;
import com.model.Data_processing;

public class SML {

	public static void main(String[] args) throws FileNotFoundException, IOException, TransformerConfigurationException, ParserConfigurationException, SAXException, TransformerException, ParseException {
		// TODO Auto-generated method stub

		//Data_processing.replace_Dollar(".\\Data\\student-data.txt");
		//Data_processing.replace_Hash_Add_Id(".\\Data\\Students_Data.csv");
		//Data_processing.convert_Xml_To_Csv(".\\Data\\coursedata.xml");
		
		//SMLController.print_All_Student_Data();
		//SMLController.print_All_Courses();
		//System.out.println(SMLController.search(".\\Data\\string-to-json-online.json", "1"));
		
		//SMLController.student_course("1");
	    //SMLController.enroll_course("1", 5);
	    // SMLController.unEnroll_course("2"); 
		//SMLController.get_course_By_Id("1");
		//SMLController.replace("3", "2", "1");
	}

}

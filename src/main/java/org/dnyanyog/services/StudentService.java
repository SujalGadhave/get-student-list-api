package org.dnyanyog.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dnyanyog.common.Dbutils;

public class StudentService {
	
	List<String> student = Arrays.asList();
	
	
	public String getFirstName(String rollNumber) {
		try {
			ResultSet rs = Dbutils.executeSelectQuery("select * from student where roll_no = '"+rollNumber+"'");
			rs.next();
			return rs.getString(2);
		} catch (SQLException e){
			return "Some error occured";		
		}
	}
	
	public String getLastName(String rollNumber) {
		try {
			ResultSet rs = Dbutils.executeSelectQuery("select * from student where roll_no = '"+rollNumber+"'");
			rs.next();
			return rs.getString(3);
		} catch (SQLException e){
			return "Some error occured";		
		}
	}
	
	public String getMobile(String rollNumber) {
		try {
			ResultSet rs = Dbutils.executeSelectQuery("select * from student where roll_no = '"+rollNumber+"'");
			rs.next();
			return rs.getString(4);
		} catch (SQLException e){
			return "Some error occured";		
		}
	}
	
	public String getEmail(String rollNumber) {
		try {
			ResultSet rs = Dbutils.executeSelectQuery("select * from student where roll_no = '"+rollNumber+"'");
			rs.next();
			return rs.getString(5);
		} catch (SQLException e){
			return "Some error occured";		
		}
	}
	
	// Using ArrayList showing student details & output will be shown in XML
	public List<String> getStudentName(String firstName) throws SQLException{
		
		ArrayList<String> studentName = new ArrayList();
		
		ResultSet rs = Dbutils.executeSelectQuery("SELECT * FROM student where firstname = '"+firstName+"'");
		while(rs.next()) {
			for(int i=1;i<6;i++) {
				studentName.add(rs.getString(i));
			}
		}
		return studentName;
	}
}
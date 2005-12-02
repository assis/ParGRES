package org.pargres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.pargres.console.ResultSetPrinter;

public class SimpleConnection {

	public static void main(String[] args) {
		try { 
	        Class.forName("org.pargres.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:pargres://localhost","user","");        		
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM REGION");
			ResultSetPrinter.print(rs,10);
			ResultSetPrinter.print(con.getMetaData().getTables(null,null,null,null),10);
			System.out.println("FIM!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
		
		Connection con = null;
		
		ConnectionManager cm = new ConnectionManager();
		
		con = cm.getConnection();
		
		if(con!=null) {
			System.out.println("Established");
		}
		else {
			System.out.println("Not Established");			
		}
	}
}

package com.techlab.contact;

import java.sql.*;
public class DBConnection {
	public Connection connection =null;
	public java.sql.Statement stmt = null;
	public ResultSet res = null;
	public DBConnection() throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/contacts?user=root&password=root");
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
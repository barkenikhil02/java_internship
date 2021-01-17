package com.techlab.contact;

import java.sql.*;

public class Contact extends DBConnection {
		private int rows = 0;
		private String line = "";

		public Contact() throws Exception {
			super();
		}

		public String display() throws SQLException {
			line = "";
			try {

				stmt = connection.createStatement();
				res = stmt.executeQuery("select * from contact");

				while (res.next()) {
					line += "Fname = " + res.getString("fname") + ", Lname = "
				+ res.getString("lname") + ", Phone no = "+ res.getString("phoneno") +
				", Emailid = " + res.getString("email") + "\n";
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return line;
		}

		public String search(String fname, String lname) throws SQLException {
			line = "";
			try {

				stmt = connection.createStatement();
				res = stmt.executeQuery("select * from contact where fname='" +
				fname + "' and lname='" + lname + "'");

				while (res.next()) {
					line += "Fname = " + res.getString("fname") + ", Lname = " 
				+ res.getString("lname") + ", Phone no = "+ res.getString("phoneno")
				+ ", Emailid = " + res.getString("email") + "\n";
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return line;
		}

		public int add(String fname, String lname, String phoneno, String email) throws SQLException {
			try {
				PreparedStatement pstmt = connection.prepareStatement("INSERT INTO contact VALUES(?,?,?,?);");
				pstmt.setString(1, fname);
				pstmt.setString(2, lname);
				pstmt.setString(3, phoneno);
				pstmt.setString(4, email);
				int rows = pstmt.executeUpdate();
				return rows;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}

		public int delete(String fname, String lname) throws SQLException {
			try {
				line = "delete from contact where fname='" + fname + "' and lname='" + lname + "'";
				rows = stmt.executeUpdate(line);
				return rows;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;

		}

		public boolean show(String fname, String lname, String phoneno) {
			line = "";
			try {
				String line1 = "Select * from contact where fname='" + fname +
						"' and lname='" + lname + "' and phoneno='"
						+ phoneno + "'";
				res = stmt.executeQuery(line1);
				while (res.next()) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;

		}

		public void update(String fname, String lname, String phoneno, String newphoneno) {
			try {
				line = "update contact set phoneno='" + newphoneno + "' where fname='" +
			fname + "' and lname='" + lname
						+ "' and phoneno='" + phoneno + "'";
				
				rows = stmt.executeUpdate(line);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void closeConnection() throws SQLException {
			connection.close();
		}
	}
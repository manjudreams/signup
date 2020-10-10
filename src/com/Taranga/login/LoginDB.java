package com.Taranga.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDB {
	private static boolean status = false;

	public static boolean getData(String username, String password) throws ClassNotFoundException, SQLException {
		System.out.println(username + " " + password);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database2", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from signup where username=? and password=?");
		ps.setString(1,username);
		ps.setString(2,password);
		 ResultSet rs = ps.executeQuery();
		status = rs.next();
		return status;
	}
}

package com.Taranga.signup;

import java.sql.*;

public class SignupDB {
	public int save(SignupBean sBean) throws SQLException, ClassNotFoundException {
		int status = 0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database2", "root", "root");
		PreparedStatement ps = con.prepareStatement(
				"INSERT INTO signup VALUES(?,?,?,?,?,?)");
		ps.setString(1, sBean.getFirstname());
		ps.setString(2,sBean.getLastname());
        ps.setString(3,sBean.getUsername());
        ps.setString(4,sBean.getPassword());
        ps.setString(5,sBean.getEmail());
        ps.setLong(6, sBean.getMobileNo());
        int rs = ps.executeUpdate();
       status=rs;
		return status;
	}
}

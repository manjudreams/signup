package com.Taranga.signup;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int status;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long mobileNo = 0;
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String mobileNo1 = request.getParameter("mobile");
		try {
			mobileNo = Integer.parseInt(mobileNo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		SignupDB dB = new SignupDB();
		SignupBean sBean = new SignupBean();
		sBean.setFirstname(firstname);
		sBean.setLastname(lastname);
		sBean.setUsername(username);
		sBean.setPassword(password);
		sBean.setMobileNo(mobileNo);
		sBean.setEmail(email);
		try {
			status = dB.save(sBean);
			if (status == 0) {
				response.sendRedirect("signupfail.jsp");
			} else {
				response.sendRedirect("signupsuccess.jsp");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}

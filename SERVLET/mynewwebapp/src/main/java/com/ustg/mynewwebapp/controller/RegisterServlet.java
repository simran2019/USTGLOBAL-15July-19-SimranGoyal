package com.ustg.mynewwebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;
import com.ustg.mynewwewbapp.dao.EmployeeDao;
import com.ustg.mynewwewbapp.dao.EmployeeDaoImp;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String salary = req.getParameter("salary");
		String designation = req.getParameter("designation");
		String password = req.getParameter("password");
		
		Employee_InfoBean bean = new Employee_InfoBean();
		bean.setEmp_id(Integer.parseInt(id));
		bean.setEmp_name(name);
		bean.setEmp_age(Integer.parseInt(age));
		bean.setEmp_salary(Double.parseDouble(salary));
		bean.setEmp_designation(designation);
		bean.setPassword(password);
		
		EmployeeDao dao = new EmployeeDaoImp();
		dao.addEmployee(bean);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
		
	}

}

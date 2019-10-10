package com.ustg.mynewwebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;
import com.ustg.mynewwewbapp.dao.EmployeeDao;
import com.ustg.mynewwewbapp.dao.EmployeeDaoImp;

@WebServlet("/login1")
public class loginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
	dispatcher.forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		
		EmployeeDao dao = new EmployeeDaoImp();
		Employee_InfoBean bean = dao.login(Integer.parseInt(id), password);
		
		String url = null;
		if(bean != null) {
			HttpSession session = req.getSession();
			session.setAttribute("bean", bean);
			url = "/home.jsp";
		}else {
			url = "/login1.jsp";
		}
		
		// hibernate request to validate the user
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}

}

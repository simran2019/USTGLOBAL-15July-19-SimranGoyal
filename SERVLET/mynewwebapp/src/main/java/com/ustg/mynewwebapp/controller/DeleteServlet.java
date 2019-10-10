package com.ustg.mynewwebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustg.mynewwewbapp.dao.EmployeeDao;
import com.ustg.mynewwewbapp.dao.EmployeeDaoImp;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		EmployeeDao dao = new EmployeeDaoImp();
		dao.deleteEmployee(Integer.parseInt(id));
		
		HttpSession session = req.getSession(false);
		session.invalidate();
		
		resp.sendRedirect("./login1");
		
	}

}

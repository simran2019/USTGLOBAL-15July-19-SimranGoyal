package com.ustg.mynewwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;
import com.ustg.mynewwewbapp.dao.EmployeeDao;
import com.ustg.mynewwewbapp.dao.EmployeeDaoImp;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	EmployeeDao dao = new EmployeeDaoImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get the form data
		String empIdVal = req.getParameter("empid");
		String password = req.getParameter("password");
		
		int empid = Integer.parseInt(empIdVal);
		
		Employee_InfoBean employee_InfoBean =  dao.login(empid , password);
		if(employee_InfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("employeeinfo", employee_InfoBean);
			resp.sendRedirect("./HomePage.html");
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
		
	} // End of doPost()

}// End of class

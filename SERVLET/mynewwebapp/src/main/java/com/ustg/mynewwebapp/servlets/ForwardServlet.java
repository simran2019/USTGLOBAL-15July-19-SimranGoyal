package com.ustg.mynewwebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employee_InfoBean employee_InfoBean = new Employee_InfoBean();
		employee_InfoBean.setEmp_id(999);
		employee_InfoBean.setEmp_name("abcd");
		employee_InfoBean.setEmp_salary(3455);
		employee_InfoBean.setEmp_age(22);
		employee_InfoBean.setEmp_designation("dsc");
		
		req.setAttribute("employee", employee_InfoBean );
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/reqAttribute");
		dispatcher.forward(req, resp);
		
		
	}//End of doGet()
}// End of servlet

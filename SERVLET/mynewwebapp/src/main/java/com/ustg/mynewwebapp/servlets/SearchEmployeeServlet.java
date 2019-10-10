package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;
import com.ustg.mynewwewbapp.dao.EmployeeDaoImp;

@WebServlet("/searchEmp")
public class SearchEmployeeServlet extends HttpServlet {
	
	private EmployeeDaoImp dao = new EmployeeDaoImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session != null) {
	
			// get the form data
			String empIdVal = req.getParameter("empid");
			int empid = Integer.parseInt(empIdVal);
			
			Employee_InfoBean employee_InfoBean = dao.searchEmployee(empid);
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(employee_InfoBean != null) {
				out.println("<h3>Employee data for emp id = "+empid+"</h3>");
				out.println("Employee id ="+employee_InfoBean.getEmp_id());
				out.println("<br/>Employee name ="+employee_InfoBean.getEmp_name());
				out.println("<br/>Employee age ="+employee_InfoBean.getEmp_age());
				out.println("<br/>Employee salary ="+employee_InfoBean.getEmp_salary());
				out.println("<br/>Employee designation ="+employee_InfoBean.getEmp_designation());
			}
			else {
				out.println("<h2>Employee record for id "+empid+"not found</h2>");
			}

			out.println("</body>");
			out.println("</html>");
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
	
		
	}
}

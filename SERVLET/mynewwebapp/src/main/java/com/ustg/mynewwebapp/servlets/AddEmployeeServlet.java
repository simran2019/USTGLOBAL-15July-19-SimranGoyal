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

@WebServlet("/addEmp")
public class AddEmployeeServlet extends HttpServlet {

	private EmployeeDaoImp dao1 = new EmployeeDaoImp();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			// post the form

			Employee_InfoBean ebean = new Employee_InfoBean();

			String empIdVal = req.getParameter("empid");
			int empid = Integer.parseInt(empIdVal);
			String empNameVal = req.getParameter("empname");
			String empAgeVal = req.getParameter("empage");
			int empage = Integer.parseInt(empAgeVal);
			String empSalaryVal = req.getParameter("empsalary");
			double empsalary = Double.parseDouble(empSalaryVal);
			String empDesVal = req.getParameter("empdesg");
			String empPass = req.getParameter("emppassword");
			

			ebean.setEmp_id(empid);
			ebean.setEmp_name(empNameVal);
			ebean.setEmp_age(empage);
			ebean.setEmp_salary(empsalary);
			ebean.setEmp_designation(empDesVal);
			ebean.setPassword(empPass);

			boolean ab = dao1.addEmployee(ebean);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (ab == true) {
				
				out.println("<h2> Employee name ="+empNameVal);

				out.println("Employee id =" + empid);
				out.println("<br/>Employee name =" + empNameVal);
				out.println("<br/>Employee age =" + empAgeVal);
				out.println("<br/>Employee salary =" + empSalaryVal);
				out.println("<br/>Employee designation =" + empDesVal);
			} else {
				out.println("<h3>data already exsists</h3>");
			}

			out.println("</body>");
			out.println("</html>");
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
			
		}
	}
	



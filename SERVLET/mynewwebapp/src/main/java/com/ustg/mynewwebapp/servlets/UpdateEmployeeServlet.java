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

@WebServlet("/updateEmp")
public class UpdateEmployeeServlet extends HttpServlet {
	
	private EmployeeDaoImp dao1 = new EmployeeDaoImp();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			String empIdVal = req.getParameter("empid");
			int empid = Integer.parseInt(empIdVal);
		
			String empNameVal = req.getParameter("empname");
			
			String empAgeVal = req.getParameter("empage");
			int empage = Integer.parseInt(empAgeVal);
			
			String empSalaryVal = req.getParameter("empsalary");
			double empsalary = Double.parseDouble(empSalaryVal);
			
			String empDesVal = req.getParameter("empdesg");
			

			boolean ab = dao1.updateEmployee(empid ,empage , empNameVal  , empDesVal , empsalary);

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (ab == true ) {
out.println("<h3>update successful<h3>");
			
			} else {
				out.println("<h3>update not succesful</h3>");
			}

			out.println("</body>");
			out.println("</html>");
			
		}else {
			resp.sendRedirect("./LoginForm.html");
		}
		
	
	}

}

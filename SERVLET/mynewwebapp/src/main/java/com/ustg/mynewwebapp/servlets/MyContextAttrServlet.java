package com.ustg.mynewwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;

@WebServlet("/contextAttr")
public class MyContextAttrServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employee_InfoBean employee_InfoBean = new Employee_InfoBean();
		employee_InfoBean.setEmp_id(999);
		employee_InfoBean.setEmp_name("Simran" );
		employee_InfoBean.setEmp_salary(3455);
		employee_InfoBean.setEmp_age(22);
		employee_InfoBean.setEmp_designation("dsc");
		
		ServletContext context = getServletContext();
		context.setAttribute("emp", employee_InfoBean);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Context attribute has been set...</h3>");
		out.println("</body>");
		out.println("</html>");
		
		
	}// End of doGet()

}//End of servlet

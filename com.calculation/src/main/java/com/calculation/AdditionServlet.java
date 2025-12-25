package com.calculation;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/add")
public class AdditionServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
		System.out.println("Data received by a addition");
		System.out.println(n1);
		System.out.println(n2);
		
		String v1 = (String) req.getAttribute("num1");
		String v2 = (String) req.getAttribute("num2");
		
		int res = Integer.parseInt(v1) + Integer.parseInt(v2);
		
		req.setAttribute("Result", res);;
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
//		resp.sendRedirect("result.jsp");		// won't work this method
		rd.forward(req, resp);
	}

}

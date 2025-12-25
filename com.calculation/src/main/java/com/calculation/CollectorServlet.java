package com.calculation;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/collect")
public class CollectorServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
		System.out.println("Data received by a collector");
		System.out.println(n1 + " "+ n2);
		
		req.setAttribute("num1", n1);
		req.setAttribute("num2", n2);
		
		RequestDispatcher rd = req.getRequestDispatcher("add");
		rd.forward(req, resp);
	}

}

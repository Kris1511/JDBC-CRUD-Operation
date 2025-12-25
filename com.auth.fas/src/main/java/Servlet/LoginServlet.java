package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("name");
		String password = req.getParameter("password");
		
		String dbPass = null;
		try {
			dbPass = DataHandler.fetchData(uname);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter pw = resp.getWriter();
		if (password.equals(dbPass)) {
			pw.println("Login success!");
		} else {
			pw.println("Login fail!");
		}
	}

}

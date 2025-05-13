package Bai2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        String username = req.getParameter("username");
	        String password = req.getParameter("password");

	        HttpSession session = req.getSession();

	        if ("admin".equals(username) && "admin123".equals(password)) {
	            session.setAttribute("user", username);
	            req.setAttribute("message", "Đăng nhập thành công!");
	        } else {
	            req.setAttribute("message", "Đăng nhập thất bại!");
	        }

	        req.getRequestDispatcher("result.jsp").forward(req, resp);
	    }
}

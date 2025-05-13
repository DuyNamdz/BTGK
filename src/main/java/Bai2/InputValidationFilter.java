package Bai2;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class InputValidationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String username = req.getParameter("username");

        if (username == null || username.trim().isEmpty()) {
            request.setAttribute("message", "Tên người dùng không được để trống.");
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
}

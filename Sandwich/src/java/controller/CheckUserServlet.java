package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sandwich.customerSW;

public class CheckUserServlet extends HttpServlet {

    customerSW cusSW = new customerSW();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse
response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse
response)
            throws ServletException, IOException {
        if (cusSW.checkUser(request.getParameter("user"))) {
            response.getWriter().write("<img src=\"images/unchecked.png\" />");
        } else {
            response.getWriter().write("<img src=\"images/checked.png\" />");
        }
    }
}

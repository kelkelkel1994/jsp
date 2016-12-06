package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.customer;
import sandwich.customerSW;
import tools.MD5;

public class UsersServlet extends HttpServlet {

    customerSW cusSW = new customerSW();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String url = "";
        customer users = new customer();
        HttpSession session = request.getSession();
        switch (command) {
            case "insert":
                String pas = MD5.encryption(request.getParameter("Pass"));
                if (cusSW.checkUser(request.getParameter("User"))) {
                    request.setAttribute("user", "User đã có người sử dụng!");
                    url = "/signup.jsp";
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
                } else if (cusSW.checkEmail(request.getParameter("Email"))) {
                    request.setAttribute("email", "Email đã có người sử dụng!");
                    url = "/signup.jsp";
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
                } else {
                    users.setIDcus(new java.util.Date().getTime());
                    users.setTen(request.getParameter("Name"));
                    users.setEmail(request.getParameter("Email"));
                    users.setDT(request.getParameter("Phone"));
                    users.setDiachi(request.getParameter("Address"));
                    users.setUser(request.getParameter("User"));
                    users.setPass(pas);
                    users.setStatus(true);
                    cusSW.insertUser(users);
                    session.setAttribute("user", users);
                    response.sendRedirect("index.jsp");
                }
                break;
            case "login":
                users = cusSW.login(request.getParameter("User"), MD5.encryption(request.getParameter("Pass")));
                if (users != null) {
                    session.setAttribute("user", users);
                    response.sendRedirect("index.jsp");
                } else {
                    request.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
                    url = "/login.jsp";
                    //response.sendRedirect("login.jsp");
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
                }
                break;
        }
    }

}

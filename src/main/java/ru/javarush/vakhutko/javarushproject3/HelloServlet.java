package ru.javarush.vakhutko.javarushproject3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(true);
        session.setAttribute("name", request.getParameter("username"));
        session.setAttribute("countGame", 0);
        session.setAttribute("ip", request.getRemoteAddr());

        System.out.println(request.getParameter("username"));

        request.getRequestDispatcher("/level1.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
package ru.javarush.vakhutko.javarushproject3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "level1Servlet", value = "/level1-servlet")
public class Level1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("answer").equals("success")) {
            req.getRequestDispatcher("/level2.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("fail")) {
            req.setAttribute("info", "Ты отклонил вызов.");
            req.getRequestDispatcher("/lose.jsp").forward(req, resp);
        }
    }
}
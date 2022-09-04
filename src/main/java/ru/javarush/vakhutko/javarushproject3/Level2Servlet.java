package ru.javarush.vakhutko.javarushproject3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "level2Servlet", value = "/level2-servlet")
public class Level2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("answer").equals("success")) {
            req.getRequestDispatcher("/level3.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("fail")) {
            req.setAttribute("info", "Ты не пошёл на переговоры.");
            req.getRequestDispatcher("/lose.jsp").forward(req, resp);
        }
    }
}

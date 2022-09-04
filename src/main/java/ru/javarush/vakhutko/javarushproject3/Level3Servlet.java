package ru.javarush.vakhutko.javarushproject3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "level3Servlet", value = "/level3-servlet")
public class Level3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("answer").equals("success")) {
            req.getRequestDispatcher("/win.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("fail")) {
            req.setAttribute("info", "Твою ложь разоблачили.");
            req.getRequestDispatcher("/lose.jsp").forward(req, resp);
        }
    }
}
package ru.javarush.vakhutko.javarushproject3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "webServlet", value = "/win-servlet")
public class WinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("countGame", ((int) req.getSession().getAttribute("countGame")) + 1);
        req.getRequestDispatcher("/level1.jsp").forward(req, resp);
    }
}
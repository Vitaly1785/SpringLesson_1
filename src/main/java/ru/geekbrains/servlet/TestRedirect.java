package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestRedirect", urlPatterns = "/test_redirect")
public class TestRedirect extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(TestRedirect.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New Redirect");

        resp.getWriter().printf("<h1>Redirect Now</h1>");
    }
}

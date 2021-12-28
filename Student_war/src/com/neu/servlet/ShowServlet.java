package com.neu.servlet;

import com.neu.dao.StudentDao;
import com.neu.entity.Student;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowServlet")
public class ShowServlet  extends HttpServlet{

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        StudentDao dao = new StudentDao();
        List<Student> list = dao.getAllStudent();
        req.setAttribute("list", list);
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}

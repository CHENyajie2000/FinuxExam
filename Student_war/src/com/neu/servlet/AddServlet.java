package com.neu.servlet;

import com.neu.dao.StudentDao;
import com.neu.entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String ageStr = req.getParameter("age");
        String address = req.getParameter("address");
        Student student = new Student();
        student.setName(name);
        student.setPwd(pwd);
        student.setAge(Integer.valueOf(ageStr));
        student.setAddress(address);
        StudentDao dao = new StudentDao();
        dao.addStudent(student);
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }

}

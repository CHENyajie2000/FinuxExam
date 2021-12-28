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


@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //查询到选中ID的值所对应的数据
        String idStr = req.getParameter("id");
        if (idStr != null && !idStr.equals("")) {
            int id = Integer.valueOf(idStr);
            StudentDao dao = new StudentDao();
            Student student = dao.selectStudentById(id);
            req.setAttribute("student", student);
        }
        req.getRequestDispatcher("update.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
          req.setCharacterEncoding("utf-8");
         resp.setContentType("text/html;charset=utf-8");
        //根据此ID对数据的值进行修改
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String ageStr = req.getParameter("age");
        String address = req.getParameter("address");
        String idStr = req.getParameter("id");
        Student student = new Student();
        student.setId(Integer.valueOf(idStr));
        student.setName(name);
        student.setPwd(pwd);
        student.setAge(Integer.valueOf(ageStr));
        student.setAddress(address);
        StudentDao dao = new StudentDao();
        dao.updateStudent(student);
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }
}

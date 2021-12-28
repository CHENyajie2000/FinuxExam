package com.neu.servlet;

import com.neu.dao.StudentDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
          req.setCharacterEncoding("utf-8");
         resp.setContentType("text/html;charset=utf-8");
        String idStr = req.getParameter("id");  //删除数据的ID，根据ID删除
        if(idStr != null && !idStr.equals("")){
            int id = Integer.valueOf(idStr);
            StudentDao dao = new StudentDao();
            dao.deleteStudent(id);
        }
        req.getRequestDispatcher("ShowServlet").forward(req, resp);
    }
}

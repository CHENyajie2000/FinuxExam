package com.neu.dao;

import com.neu.DBUtil.DbHelper;
import com.neu.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getAllStudent() {  //查询所有信息
        List<Student> list = new ArrayList<>();
        Connection conn = DbHelper.getConnection();
        String sql = "select * from t_student";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Student student = new Student();
                student.setId(rst.getInt("id"));
                student.setName(rst.getString("name"));
                student.setPwd(rst.getString("pwd"));
                student.setAge(rst.getInt("age"));
                student.setAddress(rst.getString("address"));
                list.add(student);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addStudent(Student student) {//添加信息
        String sql = "INSERT INTO t_student(id,name,pwd,age,address) VALUES (?,?,?,?,?)";  //添加的SQL语句
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, student.getId());
            pst.setString(2, student.getName());
            pst.setString(3, student.getPwd());
            pst.setInt(4,student.getAge());
            pst.setString(5,student.getAddress());
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStudent(Student student) {//修改
        String sql = "UPDATE t_student SET name =?,pwd=?,age=?,address=? WHERE id=?";  //修改的SQL语句，根据ID修改
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, student.getName());
            pst.setString(2, student.getPwd());
            pst.setInt(3,student.getAge());
            pst.setString(4,student.getAddress());
            pst.setInt(5, student.getId());
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteStudent(int id) { //删除
        String sql = "delete from t_student where id = ?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Student selectStudentById(int id) {//根据ID进行查询
        Connection conn = DbHelper.getConnection();
        String sql = "select * from t_student where id = " + id;
        Student student = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                student = new Student();
                student.setId(rst.getInt("id"));
                student.setName(rst.getString("name"));
                student.setPwd(rst.getString("pwd"));
                student.setAge(rst.getInt("age"));
                student.setAddress(rst.getString("address"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}

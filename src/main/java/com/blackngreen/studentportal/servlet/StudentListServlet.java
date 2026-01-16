package com.blackngreen.studentportal.servlet;

import com.blackngreen.studentportal.model.Student;
import com.blackngreen.studentportal.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet to display the list of students.
 */
public class StudentListServlet extends HttpServlet {
    /**
     * Handles GET requests to display students.
     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Student> students = StudentService.getAllStudents();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student List</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");

        out.println("<body>");
        out.println("<div class='container'>");

        out.println("<div class='navbar'>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<a href='add-student'>Add Student</a>");
        out.println("</div>");

        out.println("<h1>Student List</h1>");
        out.println("<p class='page-subtitle'>All registered students</p>");

        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Email</th>");
        out.println("<th>Course</th>");
        out.println("</tr>");

        for (Student student : students) {
            out.println("<tr>");
            out.println("<td>" + student.getId() + "</td>");
            out.println("<td>" + student.getName() + "</td>");
            out.println("<td>" + student.getEmail() + "</td>");
            out.println("<td>" + student.getCourse() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}

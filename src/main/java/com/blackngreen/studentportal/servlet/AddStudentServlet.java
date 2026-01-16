package com.blackngreen.studentportal.servlet;

import com.blackngreen.studentportal.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet to add a new student.
 */
public class AddStudentServlet extends HttpServlet {

    /**
     * Display the Add Student form.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Add Student</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");

        out.println("<body>");
        out.println("<div class='container'>");

        out.println("<div class='navbar'>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<a href='students'>View Students</a>");
        out.println("</div>");

        out.println("<h1>Add Student</h1>");
        out.println("<p class='page-subtitle'>Enter student details below</p>");

        out.println("<div class='form-container'>");
        out.println("<form method='post' action='add-student'>");

        out.println("<div class='form-group'>");
        out.println("<label>Name</label>");
        out.println("<input type='text' name='name' required>");
        out.println("</div>");

        out.println("<div class='form-group'>");
        out.println("<label>Email</label>");
        out.println("<input type='email' name='email' required>");
        out.println("</div>");

        out.println("<div class='form-group'>");
        out.println("<label>Course</label>");
        out.println("<input type='text' name='course' required>");
        out.println("</div>");

        out.println("<div class='form-actions'>");
        out.println("<input type='submit' value='Add Student'>");
        out.println("</div>");

        out.println("</form>");
        out.println("</div>");

        out.println("<a class='secondary-link' href='students'>View Students</a>");

        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Handle form submission.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        if (name == null || name.isEmpty()
                || email == null || email.isEmpty()
                || course == null || course.isEmpty()) {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>All fields are required!</h3>");
            out.println("<a href='add-student'>Go Back</a>");
            return;
        }

        StudentService.addStudent(name, email, course);

        // PRG pattern
        response.sendRedirect("students");
    }
}

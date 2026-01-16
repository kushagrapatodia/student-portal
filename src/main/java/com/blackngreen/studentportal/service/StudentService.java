package com.blackngreen.studentportal.service;

import com.blackngreen.studentportal.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage students in-memory.
 */
public class StudentService {

    private static final List<Student> students = new ArrayList<>();
    private static int idCounter = 1;
    static {
        addStudent("Alice", "alice@example.com", "Computer Science");
        addStudent("Bob", "bob@example.com", "Mechanical Engineering");
    }


    /**
     * Returns all students.
     */
    public static List<Student> getAllStudents() {
        return students;
    }

    /**
     * Adds a new student.
     */
    public static void addStudent(String name, String email, String course) {
        Student student = new Student(idCounter++, name, email, course);
        students.add(student);
    }

    /**
     * Finds a student by ID.
     */
    public static Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    /**
     * Deletes a student by ID.
     */
    public static boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
}

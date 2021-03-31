package com.festus.decagon;

import com.festus.decagon.Enum.Course;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Course> courses;



    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();

    }

    /**
     *
     * @return the list of teachers int the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public List<Teacher> getListOfTeachers() {
        return teachers;
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getListOfStudent() {
        return students;
    }

    public List<Course> getListOfCourses() {
        return courses;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }
}

package com.festus.decagon;

import com.festus.decagon.Enum.Course;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff {
    private List<Course> coursesTaught = new ArrayList<>();
    private List<Exam> teacherExam;


    public Teacher(int id, String name) {
        super(id, name);
    }

    public void addToCoursesTaught(Course course){

        coursesTaught.add(course);

    }

    public void removeFromCoursesTaught(Course course){

        coursesTaught.remove(course);

    }



}

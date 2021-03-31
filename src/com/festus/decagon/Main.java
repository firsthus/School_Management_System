package com.festus.decagon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher Bond = new Teacher(1001,"Bond");
        Teacher Fatimah = new Teacher(1002,"Fatimah");
        Teacher Fedrica = new Teacher(1003,"Fedrica");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Bond);
        teacherList.add(Fatimah);
        teacherList.add(Fedrica);


        Student Taiwo = new Student(1000701,"Taiwo");
        Student Francis = new Student(1000702,"Francis");
        Student Tolu = new Student(1000703,"Tolu");
        List<Student> studentList = new ArrayList<>();

        studentList.add(Taiwo);
        studentList.add(Tolu);
        studentList.add(Francis);








    }
}

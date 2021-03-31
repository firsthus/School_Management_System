package com.festus.decagon;
import com.festus.decagon.Enum.Course;
import com.festus.decagon.Enum.ExamType;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Student extends Person{

    private List<Course> studentCourses = new ArrayList<>();
    private Exam courseExam ;
    private List<Exam> studentExam;
    private boolean takenExam;


    public Student(int id, String name){
        super(id,name);
    }


    public void addToCourseList(Course course){

        studentCourses.add(course);

    }

    public void removeFromCourseList(Course course){

        studentCourses.remove(course);

    }


    public void takeExam(){
      if(takenExam){

          System.out.println("Exams have been taking already");
      }

        else{
        Iterator<Course> courseIterator = studentCourses.listIterator();
         while(courseIterator.hasNext()){
             studentExam.add(new Exam(ExamType.SCHOOL_EXAM).takeExam(courseIterator.next())) ;
         }}


    }


}

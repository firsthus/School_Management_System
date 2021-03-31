package com.festus.decagon;

import com.festus.decagon.Enum.Course;
import com.festus.decagon.Enum.ExamType;

public class Exam {

    private Course examOnSubject;

    public int getExamScore() {
        return examScore;
    }




    private int examScore;
    private boolean examTaken;
    private ExamType examType;

    Exam(ExamType examType){
        this.examType = examType;
        this.examTaken = false;
    }


    public Exam takeExam(Course course){
        this.examOnSubject = course;
        examScore= (int)Math.random()*100;
        return this;

    }

    public Exam takeExam(){

        this.examScore=(int)Math.random()*100;
        return this;
    }


}

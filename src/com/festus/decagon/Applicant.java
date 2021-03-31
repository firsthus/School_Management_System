package com.festus.decagon;

import com.festus.decagon.Enum.AdmissionStatus;
import com.festus.decagon.Enum.ExamType;

public class Applicant extends Person {

    private AdmissionStatus status = AdmissionStatus.NOT_ADMITTED;
    private boolean examTaken;
    private int age;

    public void setStatus(AdmissionStatus status) {
        this.status = status;
    }

    public AdmissionStatus getStatus() {
        return status;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Applicant(int id, String name) {
        super(id, name);
        this.age = age;
    }


    public Exam takeExam(){
      Exam exam=null;
        if(examTaken){

            System.out.println("Exams have been taking already");
        }

        else{
        exam = new Exam(ExamType.ENTRANCE_EXAM);

        }
     return exam.takeExam();
    }



}

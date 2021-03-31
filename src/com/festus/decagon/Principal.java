package com.festus.decagon;

import com.festus.decagon.Enum.AdmissionStatus;

public class Principal extends Staff{

    public Principal(int id, String name) {
        super(id, name);
    }


    public void admitStudent(Applicant applicant){
        if(applicant.takeExam().getExamScore()>55 && applicant.getAge() == 16){
            applicant.setStatus(AdmissionStatus.ADMITTED);
        }
        else applicant.setStatus(AdmissionStatus.NOT_ADMITTED);

    }

    public void expelStudent(Student student){
        School school = new School();
        school.getListOfStudent().remove(student);
    }

}

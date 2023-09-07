package Adaptee;

import Adapter.CollegeStudentAdapter;

public class CollegeStudent implements Student{

    String name;
    String rollNo;

    CollegeStudent () {

    }
    public CollegeStudent (String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public String getStudentName() {
        return name;
    }

    @Override
    public String getStudentRollNumber() {
        return rollNo;
    }
}

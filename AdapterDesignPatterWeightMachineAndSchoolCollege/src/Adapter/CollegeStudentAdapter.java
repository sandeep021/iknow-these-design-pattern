package Adapter;

import Adaptee.CollegeStudent;
import Adaptee.SchoolStudent;

public class CollegeStudentAdapter {
    public SchoolStudent getSchoolStudent (CollegeStudent collegeStudent){
        return new SchoolStudent(collegeStudent.getStudentName(), collegeStudent.getStudentRollNumber());
    }
}

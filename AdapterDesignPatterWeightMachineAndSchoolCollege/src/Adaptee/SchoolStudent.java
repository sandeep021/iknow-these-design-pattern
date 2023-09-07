package Adaptee;

public class SchoolStudent implements Student{

    String name;
    String rollNo;

    SchoolStudent () {

    }
    public SchoolStudent (String name, String rollNo) {
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

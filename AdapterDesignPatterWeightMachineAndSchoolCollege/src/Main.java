import Adaptee.CollegeStudent;
import Adaptee.SchoolStudent;
import Adaptee.WeightMachinePound;
import Adapter.CollegeStudentAdapter;
import Adapter.WeightMachineAdapterImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<SchoolStudent> schoolStudents = new ArrayList<>();

        SchoolStudent schoolStudent = new SchoolStudent("Sand", "123");
        CollegeStudent collegeStudent = new CollegeStudent("joww", "122");
        schoolStudents.add(schoolStudent);
        //schoolStudents.add(collegeStudent)
        CollegeStudentAdapter collegeStudentAdapter = new CollegeStudentAdapter();
        schoolStudents.add(collegeStudentAdapter.getSchoolStudent(collegeStudent));//able to add new

        //weight machine

        WeightMachinePound weightMachinePound = new WeightMachinePound();

        WeightMachineAdapterImpl weightMachineAdapter = new WeightMachineAdapterImpl();
        double weightInKG = weightMachineAdapter.getWeightInKG(weightMachinePound.getObjectWeight());
        System.out.println(weightMachinePound.getObjectWeight());
        System.out.println(weightInKG);
    }
}
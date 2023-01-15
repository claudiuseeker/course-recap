package ro.claudiu.projects;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Integer> myGrades = List.of(10,3,7);
        Student marian = new Student("Marian", myGrades);
        System.out.println(marian);
        List<Integer> grades= marian.getGrades();
        grades.set(1,10);
        System.out.println(grades);
        System.out.println(marian);

       // myGrades.set(1,10);
        //System.out.println(marian);

        marian.addGrade(7);
        System.out.println(marian);;
    }
}

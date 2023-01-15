package ro.claudiu.projects;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeMain {
    public static void main(String[] args) {

       Employee programator =  new Employee("Ana", LocalDate.now().minus(10, ChronoUnit.MONTHS),Position.PROGRAMATOR);
       Employee ceo = Employee.buildCEO("BigBossMareSef");
        System.out.println((ceo.getClass()));
        System.out.println(ceo);
    }
}

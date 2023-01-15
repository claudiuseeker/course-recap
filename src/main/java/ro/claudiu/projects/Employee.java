package ro.claudiu.projects;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private final String name;
    private final LocalDate employmentDate;
    private final Position position;

    public Employee(String name, LocalDate employmentDate, Position position) {
        this.name = name;
        this.employmentDate = employmentDate;
        this.position = position;
    }

    public static Employee buildCEO(String name){
        if(name== null || name.length()<10){
            return new Employee("Ion", LocalDate.now(), Position.CEO);
        }else{
            return new CTO(name, LocalDate.now());
        }

    }

    public String getName() {
        return name;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(employmentDate, employee.employmentDate) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employmentDate, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employmentDate=" + employmentDate +
                ", position=" + position +
                '}';
    }
}

class CTO extends Employee{
    public  CTO(String name, LocalDate employmentDate){
        super(name, employmentDate, Position.CTO);
    }
}

enum Position {
    CEO,
    CFO,
    CTO,
    PROGRAMATOR
}
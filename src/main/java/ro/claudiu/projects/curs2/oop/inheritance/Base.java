package ro.claudiu.projects.curs2.oop.inheritance;

public class Base {
     Base myMethod(){
         System.out.println("public");
         return null;
    }
}

class Child extends Base{
    protected Child myMethod(){
        System.out.println("child");
        return null;
    }
}





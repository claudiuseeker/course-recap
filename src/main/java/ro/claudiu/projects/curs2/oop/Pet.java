package ro.claudiu.projects.curs2.oop;

import lombok.ToString;

@ToString
public abstract class Pet {
    private final String name;

    protected Pet(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }

    public abstract  String makeSound();
}

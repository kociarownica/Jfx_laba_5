package org.example.classes;

public class Student extends Human {
    public Student (String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String study(){
        return "Hey, i'm student!";
    };
}
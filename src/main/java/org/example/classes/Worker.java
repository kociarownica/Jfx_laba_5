package org.example.classes;

public class Worker extends Human {
    public Worker (String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String  work(){
        return "Hey, i'm worker!";
    };
}
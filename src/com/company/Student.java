package com.company;

public class Student {
    private String name;
    private int age;
    private String persNr;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String persNr){
        this.name = name;
        this.age = age;
        this.persNr = persNr;
    }

    public String getPersNr() {
        return persNr;
    }

    public String toString(){
        return String.format("%15s %3d years old.",name,age);
    }

}

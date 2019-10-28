package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /*
        Stack<Student> students = new Stack<>();

        students.push(new Student("Adam", 30));
        Student searchStudent = new Student("Bertil", 22);
        students.push(searchStudent);
        students.push(new Student("Caesar", 27));

        System.out.println(students.peek().toString());
        System.out.println(students.search(searchStudent));
        while (!students.empty()){
            System.out.println(students.pop().toString());
        }
        */
/*
        Queue<Student> queuedStudents = new LinkedList<Student>();

        queuedStudents.offer(new Student("Adam", 30));
        queuedStudents.offer(new Student("Bertil", 32));
        queuedStudents.offer(new Student("Caesar", 27));

     //   System.out.println(queuedStudents.peek().toString());

        while (!queuedStudents.isEmpty()){
            System.out.println(queuedStudents.poll().toString());
        }
        */

        HashMap<String, Student> hashedStudents = new HashMap<>();

        Student student1 = new Student("Adam", 32, "19871021-3218");
        Student student2 = new Student("Bertil", 27, "19920210-1828");
        Student student3 = new Student("Caesar", 22, "19980701-2714");
        Student student4 = new Student("David", 25, "19951221-7228");

        hashedStudents.put(student1.getPersNr(), student1);
        hashedStudents.put(student2.getPersNr(), student2);
        hashedStudents.put(student3.getPersNr(), student3);
        hashedStudents.put(student4.getPersNr(), student4);

        System.out.println(hashedStudents.get(student2.getPersNr()));

        hashedStudents.remove(student3.getPersNr());

        for (String i: hashedStudents.keySet()){
            System.out.println(i);
        }

        for (Student i :hashedStudents.values()) {
            System.out.println(i.toString());
        }

    }

}

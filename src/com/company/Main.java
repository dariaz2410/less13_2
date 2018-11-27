package com.company;

public class Main {

    public static void main(String[] args) {
        Man1 man = new Man1();
        Student student = new Student();
        man.setName("Alex");
        man.setAge(25);
        man.setSex("man");
        man.setWeight(60);
        student.setYear(2015);
        System.out.println("Name = "+ man.getName());
        System.out.println("Age = "+ man.getAge());
        System.out.println("Sex = "+ man.getSex());
        System.out.println("Weight = "+ man.getWeight());
        System.out.println("Year = "+ student.getYear());
        student.setYear(3);
        System.out.println("increase the years of study = "+ student.getYear());
    }
}

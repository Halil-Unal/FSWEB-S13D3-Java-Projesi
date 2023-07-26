package com.java3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Person person= new Person("John","Doe",20);
        person.pets=new String[2];
        person.pets[0]="cat";
        person.pets[1]="bird";
        System.out.println(Arrays.toString(person.pets));
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastname());
        System.out.println("Age: " + person.getAge());
        System.out.println(person.getfull());
        System.out.println(person.isTeen());
        System.out.println(person);
        Wall wall=new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
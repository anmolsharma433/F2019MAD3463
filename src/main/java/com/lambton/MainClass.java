package com.lambton;

public class MainClass {
    public static  void main(String[] args)
    {
        // first question
        LambtonStringTools l1= new LambtonStringTools();
        System.out.println("The reverse is : " +l1.reverse("Lambton"));

        //Second question
        System.out.println("The binary is "+l1.binarytodecimal("1000"));

        //third question
        System.out.println("The Initial are : "+l1.initials("James tiBeriUs kiRK"));

        //forth question
        System.out.println("The most frequent are : " +l1.mostFrequent("James tiBeriUs kiRK"));
    }

}

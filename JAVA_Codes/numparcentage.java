//package com.company;
import java.util.Scanner;
 
public class numparcentage {
    public static void main(String[] args) {
        
        System.out.println("please enter the number between 0 t0 100");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the subject1 number");
        float a =sc.nextInt();
        System.out.println("Enter the subject2 number");
        float b =sc.nextInt();
        System.out.println("Enter the subject3 number");
        float c =sc.nextInt();
        System.out.println("Enter the subject4 number");
        float d =sc.nextInt();
        System.out.println("Enter the subject5 number");
        float e =sc.nextInt();

        float parcentage =((a+b+c+d+e)/5);
        System.out.println("The student parcentage is :");
        System.out.println(parcentage);
        
            sc.close();

    }
}

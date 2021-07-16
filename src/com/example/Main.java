package com.example;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int Student_Count = 20;
        double Avg_Student_Score = 3.6;
        char Student_Name = 'A';
        boolean Has_Attendance = true;
        String FirstName = "Abhay";
        System.out.println("Hello from IntelliJ Idea!!");
        System.out.println(FirstName + " has a highest score " + Avg_Student_Score + " Out of " + Student_Count);
        System.out.println("What do you want to do next? ");
        Scanner input = new Scanner(System.in);
        Avg_Student_Score = input.nextDouble();
        System.out.println(FirstName + " has a highest score " + Avg_Student_Score );
    }
}

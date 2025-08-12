package com.company;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        int totalMarks =0;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter no. of subjects: ");
        int subjects = sc.nextInt();

        int i =1;
        while(i<=subjects){
            System.out.print("Enter the marks (out of 100) in subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks<0 || marks>100) {
                System.out.println("Invalid marks! enter marks between 0 and 100 please ");
                    i--;
                    continue;
            }
            totalMarks += marks;
            i++;
        }

        double avgPer = (double)totalMarks/subjects;

        //ASSIGNING GRADES

        if(avgPer>=90){
            grade = "A+";
        }
        else if(avgPer>=80){
            grade = "A";
        }
        else if(avgPer>=70){
            grade = "B";
        }
        else if(avgPer>=60) {
            grade = "C";
        }
        else if(avgPer>=50) {
            grade = "D";
        }
        else if(avgPer>=40){
            grade = "E";
        }
        else {
            grade = "F";
        }

        System.out.println("RESULT" );
        System.out.println("Name = " + name);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + avgPer + "%");
        System.out.println("Grade " + grade);

        sc.close();

    }



}

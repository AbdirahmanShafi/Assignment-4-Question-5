/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author abdir
 */
public class Assignment4Q5 {
  public static void main(String[] args) {
        // Input student's full name
        try (Scanner scanner = new Scanner(System.in)) {
            // Input student's full name
            System.out.print("Enter student's full name: ");
            String fullName = scanner.nextLine();
            
            // Input student's score
            System.out.print("Enter student's score: ");
            int score = scanner.nextInt();
            
            // Determine the grade based on the score
            String grade = null;
            if (score >= 70) {
                grade = "A";
            } else if (score >= 60) {
                grade = "B";
            } else if (score >= 50) {
                grade = "C";
            } else if (score >= 40) {
                grade = "D";
            } else if (score < 40) {
                grade = "F";
            } else {
                System.out.println("Invalid input.");
            }
            
            // Output the student's full name and grade
            System.out.println("\nStudent's Name: " + fullName);
            System.out.println("Grade: " + grade);
        }
    }
}

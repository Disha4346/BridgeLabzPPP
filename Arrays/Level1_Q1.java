
// Program: Voting Eligibility of 10 Students
// Level 1 - Question 1
// Concepts: Java Arrays, for loop, length property, validation, System.err

import java.util.Scanner;

public class Level1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array to store ages of 10 students
        int[] ages = new int[10];

        // Take user input for ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();

            // Validate input (age cannot be negative)
            if (age < 0) {
                System.err.println("Invalid Age. Exiting program.");
                System.exit(0);
            }
            ages[i] = age;
        }

        // Check eligibility
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}

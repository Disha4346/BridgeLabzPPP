
// Program: Bonus Calculation for 10 Employees
// Level 2 - Question 1
// Concepts: Java Arrays, for loop, length property, validation, System.err

import java.util.Scanner;

public class Level2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

        // Arrays to store salaries, years of service, bonus, and new salaries
        double[] salary = new double[EMPLOYEES];
        int[] yearsOfService = new int[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Take input for each employee
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            // Salary input with validation
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.err.println("Invalid Salary. Please enter again.");
                i--; // repeat this iteration
                continue;
            }

            // Years of service input with validation
            System.out.print("Enter Years of Service: ");
            int yrs = sc.nextInt();
            if (yrs < 0) {
                System.err.println("Invalid Years of Service. Please enter again.");
                i--; // repeat this iteration
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Bonus & Salary Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        sc.close();
    }
}

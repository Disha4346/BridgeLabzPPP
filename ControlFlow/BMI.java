import java.util.Scanner;

/**
 * Computes BMI = weight(kg) / (height(m)^2) and reports category.
 */
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightKg = input.nextDouble();
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25.0) status = "Normal weight";
        else if (bmi < 30.0) status = "Overweight";
        else status = "Obesity";

        System.out.println("BMI = " + bmi + " (" + status + ")");
        input.close();
    }
}

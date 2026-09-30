import java.util.Scanner;

public class Wk7P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter 10 real numbers (positive and negative):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double positiveSum = 0;
        int positiveCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
                positiveCount++;
            }
        }
        
        System.out.println("\n--- Positive Numbers ---");
        if (positiveCount > 0) {
            double positiveAverage = positiveSum / positiveCount;
            System.out.println("Sum: " + positiveSum);
            System.out.println("Average: " + positiveAverage);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        int negativeCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("\n--- Negative Numbers ---");
        System.out.println("Total count: " + negativeCount);

        double minValue = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("\n--- Array Minimum ---");
        System.out.println("Minimum value: " + minValue);

        scanner.close();
    }
}

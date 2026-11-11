import java.util.Scanner;

public class Prog1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numStudents = 0;
        while (true) {
            System.out.print("Enter the number of students (1-50): ");
            if (scanner.hasNextInt()) {
                numStudents = scanner.nextInt();
                if (numStudents >= 1 && numStudents <= 50) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Invalid input. Please enter a number between 1 and 50.");
        }

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter score for Student " + (i + 1) + " (0-100): ");
                if (scanner.hasNextInt()) {
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    }
                } else {
                    scanner.next(); 
                }
                System.out.println("Invalid score. Please enter a value from 0 to 100.");
            }
        }

        System.out.println("\n--- Exam Statistics Summary ---");
        
        double average = calculateAverage(scores);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score:  " + lowest);
        
        countPassFail(scores);
        printTotalHighestScorers(scores, highest);
        
        scanner.close();
    }

    public static double calculateAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    public static int findHighest(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int findLowest(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public static void countPassFail(int[] scores) {
        int passes = 0;
        int fails = 0;
        for (int score : scores) {
            if (score >= 75) {
                passes++;
            } else {
                fails++;
            }
        }
        System.out.println("Passing Scores (>= 75): " + passes);
        System.out.println("Failing Scores (< 75):  " + fails);
    }

    public static void printTotalHighestScorers(int[] scores, int highestScore) {
        int count = 0;
        for (int score : scores) {
            if (score == highestScore) {
                count++;
            }
        }
        System.out.println("Total number of students with the highest score: " + count);
    }
}

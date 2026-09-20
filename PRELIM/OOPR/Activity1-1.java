import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "YES";

        while (ans.equalsIgnoreCase("YES")) {
            System.out.print("Java Programming score: ");
            float javaScore = input.nextFloat();

            System.out.print("C Programming score: ");
            float cScore = input.nextFloat();

            System.out.print("Database Handling score: ");
            float dhScore = input.nextFloat();

            double avg = (javaScore + cScore + dhScore) / 3.0;
            System.out.printf("Average: %.2f\n", avg);
            
            if (avg >= 90 && avg <= 100) {
                System.out.println("Grade: A Because the average is between 90 to 100.");
            } else if (avg >= 80 && avg < 90) {
                System.out.println("Grade: B Because the average is between 80 to 89.");
            } else if (avg >= 75 && avg < 80) {
                System.out.println("Grade: C Because the average is between 75 to 79.");
            } else if (avg >= 0 && avg < 75) {
                System.out.println("Grade: F Because the average is below 75.");
            } else {
                System.out.println("Invalid Input.");
            }

            input.nextLine(); 
            
            System.out.print("Do you want to continue? (YES/NO): ");
            ans = input.nextLine();
        }

        if (ans.equalsIgnoreCase("NO")) {
            System.out.println("Program Terminated. Thank you!");
        }
        
        input.close();
    }
}


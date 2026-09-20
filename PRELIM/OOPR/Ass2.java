import java.util.Scanner;

public class Ass2 {
    public static void laalpha() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        
        // Compare integers to find the maximum value
        int maxNumber = a;
        if (b > maxNumber) {
            maxNumber = b;
        }
        if (c > maxNumber) {
            maxNumber = c;
        }
        
        System.out.println("\nThe largest number is: " + maxNumber);
        
        input.close();
    }

    public static void main(String[] args) {
        laalpha();
    }
}

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "YES";
        
        float x, y, add, sub, mult, div, mod, inc, dec;
        
            while (ans.equalsIgnoreCase("YES")) {
                System.out.println("THE ARITHMETIC CALCULATOR");
                
                System.out.print("Select the value of x: ");
                x = input.nextFloat();
                System.out.print("Select the value of y: ");
                y = input.nextFloat();
                
                add = x + y;
                sub = x - y;
                mult = x * y;
                div = x / y;
                mod = x % y;
                inc = x + 1;
                dec = x - 1;
                
                System.out.println("Arithmetic Operations:");
                System.out.println("Addition: x + y = " + add);
                System.out.println("Subtract: x - y = " + sub);
                System.out.println("Multiplication: x * y = " + mult);
                System.out.println("Division: x / y = " + div);
                System.out.println("Modulus: x % y = " + mod);
                System.out.println("Increment: x++ = " + inc);
                System.out.println("Decrement: x-- = " + dec);
                
                input.nextLine(); 
                
                System.out.print("Do you want to continue? (YES/NO): ");
                ans = input.nextLine();
            }
            
            if (ans.equalsIgnoreCase("NO")) {
            System.out.println("Program Terminated. Thank you!");
            input.close();
            }
        }
    }
        


import java.util.Scanner;

public class EvenNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        
        System.out.println("Enter ten Numbers: ");
        for (int i = 0; i < 10; i++){
           num[i] = scanner.nextInt();
        }
        
        System.out.println("\nHere is the list of the even number/s: ");
        for (int i = 0; i < 10; i++){
            if (num[i] % 2 == 0){
                System.out.println(num[i] + " ");
            }
        }
        System.out.printd("\n");
    }
}
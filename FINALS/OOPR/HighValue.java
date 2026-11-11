import java.util.Scanner;

public class HighValue{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        
        System.out.println("Enter Ten Numbers: ");
        for (int i = 0; i < 10; i++){
            num[i] = scanner.nextInt();
        }
        
        int high = num[0];
        for (int i = 0; i < 10; i++){
            if (num[i] > high) {
                high = num[i];
            }
        }
        System.out.println("The highest Number is: " + high);
        System.out.println("\nThe difference from the highest are: ");
        
        for (int i = 0; i < 10; i++){
            int diff = high - num[i];
            System.out.println(high + " - " + num[i] + " = " + diff);
        }
    }
}
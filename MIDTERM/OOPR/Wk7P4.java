import java.util.Scanner;

public class Wk7P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter any " + size + " elements in Array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Even Elements: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd Elements: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}

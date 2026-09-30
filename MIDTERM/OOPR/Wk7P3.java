import java.util.Scanner;

public class Wk7P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.print("Enter Data in Array: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Stored Data in Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Enter poss. of Element to Delete: ");
        int position = scanner.nextInt();

        if (position < 0 || position >= 5) {
            System.out.println("Invalid position!");
        } else {
            for (int i = position; i < 4; i++) {
                array[i] = array[i + 1];
            }

            System.out.print("New data in Array: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

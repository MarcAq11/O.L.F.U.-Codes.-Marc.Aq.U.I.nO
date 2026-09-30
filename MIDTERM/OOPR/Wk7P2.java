import java.util.Scanner;

public class Wk7P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] uniqueNumbers = new int[8];
        int uniqueCount = 0;

        for (int i = 0; i < 8; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueNumbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.print("\nArray after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();

        if (uniqueCount < 2) {
            System.out.println("Cannot find second largest or second smallest (less than 2 unique elements).");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueNumbers[i] > largest) {
                    secondLargest = largest;
                    largest = uniqueNumbers[i];
                } else if (uniqueNumbers[i] > secondLargest) {
                    secondLargest = uniqueNumbers[i];
                }
            }
            System.out.println("Second largest element: " + secondLargest);

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueNumbers[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = uniqueNumbers[i];
                } else if (uniqueNumbers[i] < secondSmallest) {
                    secondSmallest = uniqueNumbers[i];
                }
            }
            System.out.println("Second smallest element: " + secondSmallest);
        }

        scanner.close();
    }
}

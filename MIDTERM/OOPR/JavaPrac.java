import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JavaPrac {

    private static final int MAX_CHAR = 256; // For character occurrence logic
    private static int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static HashMap<Integer, String> romanMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=======================================================================");
            System.out.println("                     JAVA PROGRAMS COMPILATION MENU                    ");
            System.out.println("=======================================================================");
            System.out.println("1. Display Odd Numbers (1-100)      19. Matrix Addition");
            System.out.println("2. Sum of Odd Numbers (1-100)       20. Null Matrix Check");
            System.out.println("3. Count of Odd Numbers (1-100)     21. Diagonal Matrix Check");
            System.out.println("4. Sum of First N Numbers           22. Linear Search");
            System.out.println("5. Sum of Digits of a Number        23. Binary Search");
            System.out.println("6. Electricity Bill Calculator      24. HCF and LCM Calculator");
            System.out.println("7. Armstrong Number Checker         25. Volume of a Cube");
            System.out.println("8. Armstrong Numbers up to 1000     26. Reverse a Given Number");
            System.out.println("9. Convert Number to Words          27. Integer to Roman Letters");
            System.out.println("10. Palindrome Number Checker       28. Word Count in a String");
            System.out.println("11. Palindrome Numbers up to N      29. Duplicate Words Counter");
            System.out.println("12. Prime Numbers (1-100)           30. Remove Duplicate Words");
            System.out.println("13. Pyramid Star Pattern 1          31. Breakdown Count of Each Word");
            System.out.println("14. Pyramid Star Pattern 2          32. String Palindrome Checker");
            System.out.println("15. Complex Butterfly Star Pattern  33. Remove Vowels from String");
            System.out.println("16. Floyd's Triangle                34. Capitalize First Letter of Words");
            System.out.println("17. Sequence Number Pattern         35. Split Comma-Separated String");
            System.out.println("18. Array Statistics (Min/Max/Idx)  36. Count Character Occurrences");
            System.out.println("0. EXIT");
            System.out.print("Choose a program to run (0-36): ");
            
            choice = sc.nextInt();
            sc.nextLine(); 
            System.out.println("-----------------------------------------------------------------------");

            switch (choice) {
                case 1: 
                    System.out.println("The Odd Numbers are:");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 != 0) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2: 
                    int sumOdd = 0;
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 != 0) sumOdd += i;
                    }
                    System.out.println("The Sum Of 100 Odd Numbers is: " + sumOdd);
                    break;

                case 3: 
                    int countOdd = 0;
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 != 0) countOdd++;
                    }
                    System.out.println("The Count Of Odd Numbers is: " + countOdd);
                    break;

                case 4: 
                    System.out.print("Enter value for N: ");
                    int n4 = sc.nextInt();
                    int sumN = 0;
                    for (int i = 1; i <= n4; i++) sumN += i;
                    System.out.println("The Sum Of " + n4 + " Numbers is: " + sumN);
                    break;

                case 5: 
                    System.out.print("Enter an integer: ");
                    int num5 = sc.nextInt();
                    int temp5 = num5, sumDigits = 0;
                    while (num5 > 0) {
                        sumDigits += (num5 % 10);
                        num5 /= 10;
                    }
                    System.out.println("Sum of Digits of " + temp5 + " is " + sumDigits);
                    break;

                case 6: 
                    System.out.print("Enter units consumed: ");
                    int units = sc.nextInt();
                    int bill = 0;
                    if (units > 100) {
                        if (units >= 200) {
                            if (units > 300) bill = units * 8;
                            else bill = units * 6;
                        } else {
                            bill = units * 5;
                        }
                    }
                    System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
                    System.out.println("Units Consumed : " + units);
                    System.out.println("Total Bill : " + bill);
                    break;

                case 7: 
                    System.out.print("Enter a number to check: ");
                    int n7 = sc.nextInt();
                    int arg7 = n7, sumArm = 0;
                    while (n7 > 0) {
                        int r = n7 % 10;
                        sumArm += (r * r * r);
                        n7 /= 10;
                    }
                    if (arg7 == sumArm) System.out.println("Given number is an armstrong number: " + arg7);
                    else System.out.println("Given number is not an armstrong number: " + arg7);
                    break;

                case 8: 
                    System.out.print("Armstrong numbers from 1 to 1000: ");
                    for (int i = 1; i <= 1000; i++) {
                        int num8 = i, sum8 = 0;
                        while (num8 > 0) {
                            int rem = num8 % 10;
                            sum8 += (rem * rem * rem);
                            num8 /= 10;
                        }
                        if (sum8 == i) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 9: 
                    System.out.print("Enter a small number (0-99): ");
                    int n9 = sc.nextInt();
                    if (n9 <= 0) System.out.println("Enter numbers greater than 0");
                    else pw(n9, "");
                    System.out.println();
                    break;

                case 10: 
                    System.out.print("Enter a number: ");
                    int n10 = sc.nextInt();
                    int pal = n10, rev10 = 0;
                    while (n10 > 0) {
                        rev10 = rev10 * 10 + (n10 % 10);
                        n10 /= 10;
                    }
                    if (rev10 == pal) System.out.println("The given no is palindrome " + rev10);
                    else System.out.println("The given no is not palindrome " + rev10);
                    break;

                case 11: 
                    System.out.print("Enter the limit N: ");
                    int limit11 = sc.nextInt();
                    System.out.print("Palindrome numbers from 1 to N: ");
                    for (int i = 1; i <= limit11; i++) {
                        int n11 = i, rev11 = 0;
                        while (n11 > 0) {
                            rev11 = rev11 * 10 + (n11 % 10);
                            n11 /= 10;
                        }
                        if (rev11 == i) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 12: 
                    System.out.println("Prime numbers from 1 to 100 are :");
                    for (int i = 1; i <= 100; i++) {
                        int counter = 0;
                        for (int num = i; num >= 1; num--) {
                            if (i % num == 0) counter++;
                        }
                        if (counter == 2) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 13: 
                    int n13 = 4;
                    for (int i = 0; i < n13; i++) {
                        for (int j = 0; j <= i; j++) System.out.print(" * ");
                        System.out.println();
                    }
                    break;

                case 14: 
                    int k14 = 8;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < k14; j++) System.out.print(" ");
                        k14 -= 2;
                        for (int j = 0; j <= i; j++) System.out.print("* ");
                        System.out.println();
                    }
                    break;

                case 15: 
                    System.out.print("Enter N value: ");
                    int n15 = sc.nextInt();
                    int p15 = n15, q15 = n15;
                    
                    for (int i = n15; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int k = p15 * 2; k < n15 * 2 - 1; k++) {
                            System.out.print(" ");
                        }
                        for (int l = i; l != 0; l--) {
                            if (l == n15) {
                                continue;
                            }
                            System.out.print("*");
                        }
                        p15--;
                        System.out.println();
                    }
                    
                    for (int i = 1; i <= n15; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int k = q15 * 2 - 2; k > 1; k--) {
                            System.out.print(" ");
                        }
                        for (int m = i; m != 0; m--) {
                            if (m == n15) {
                                continue;
                            }
                            System.out.print("*");
                        }
                        System.out.println();
                        q15--;
                    }
                    break;

                case 16: 
                    System.out.print("Enter the number of rows: ");
                    int rows16 = sc.nextInt();
                    int count16 = 1;
                    
                    for (int i = 1; i <= rows16; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(count16 + " ");
                            count16++;
                        }
                        System.out.println();
                    }
                    break;

                case 17: 
                    int a17 = 3, b17 = 4, n17 = 8;
                    for (int i = 1; i <= n17; i++) {
                        int c17 = a17 + b17;
                        System.out.println(a17 + " " + b17 + " " + c17);
                        a17 = c17;
                        b17 += 1;
                    }
                    break;

                case 18: 
                    int[] arr18 = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
                    System.out.println("Working Array: " + Arrays.toString(arr18));
                    
                    int min = arr18[0], max = arr18[0];
                    int minIdx = 0, maxIdx = 0;
                    int largest = arr18[0], secLargest = arr18[0];
                    
                    for (int i = 1; i < arr18.length; i++) {
                        if (arr18[i] > max) { 
                            max = arr18[i]; 
                            maxIdx = i; 
                        }
                        if (arr18[i] < min) { 
                            min = arr18[i]; 
                            minIdx = i; 
                        }
                        if (arr18[i] > largest) {
                            secLargest = largest;
                            largest = arr18[i];
                        } else if (arr18[i] > secLargest) {
                            secLargest = arr18[i];
                        }
                    }
                    
                    System.out.println("Largest Number: " + max + " at Index: " + maxIdx);
                    System.out.println("Smallest Number: " + min + " at Index: " + minIdx);
                    System.out.println("Second Largest Number: " + secLargest);
                    System.out.println("Difference (Max - Min): " + (max - min));
                    break;

                case 19: 
                    int[][] matA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
                    int[][] matB = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
                    int[][] matC = new int[3][3];
                    
                    System.out.println("Result Matrix Addition:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            matC[i][j] = matA[i][j] + matB[i][j];
                            System.out.print(matC[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 20: 
                    int[][] nullMat = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
                    boolean isNull = true;
                    
                    for (int[] row : nullMat) {
                        for (int val : row) {
                            if (val != 0) { 
                                isNull = false; 
                                break; 
                            }
                        }
                    }
                    System.out.println("Is the tested matrix a Null Matrix? " + isNull);
                    break;

                case 21: 
                    int[][] diagMat = { { 1, 0, 0 }, { 0, 3, 0 }, { 0, 0, 3 } };
                    boolean isDiag = true;
                    
                    for (int i = 0; i < diagMat.length; i++) {
                        for (int j = 0; j < diagMat[i].length; j++) {
                            if (i == j && diagMat[i][j] == 0) {
                                isDiag = false;
                            }
                            if (i != j && diagMat[i][j] != 0) {
                                isDiag = false;
                            }
                        }
                    }
                    System.out.println("Is the tested matrix a Diagonal Matrix? " + isDiag);
                    break;

                case 22: 
                    int[] searchArr = { 12, 44, 23, 56, 78, 13 };
                    System.out.print("Enter value to lineary search in execution array: ");
                    int target = sc.nextInt();
                    int foundIdx = -1;
                    
                    for (int i = 0; i < searchArr.length; i++) {
                        if (searchArr[i] == target) { 
                            foundIdx = i; 
                            break; 
                        }
                    }
                    if (foundIdx != -1) {
                        System.out.println(target + " is present at location " + (foundIdx + 1));
                    } else {
                        System.out.println(target + " does not exist in array.");
                    }
                    break;

                case 23: 
                    int[] binArr = { 10, 20, 30, 40, 50 }; 
                    System.out.print("Enter item to search (Binary Search): ");
                    int item = sc.nextInt();
                    int first = 0, last = binArr.length - 1, middle = (first + last) / 2;
                    
                    while (first <= last) {
                        if (binArr[middle] < item) {
                            first = middle + 1;
                        } else if (binArr[middle] == item) {
                            System.out.println(item + " found at location " + (middle + 1) + ".");
                            break;
                        } else {
                            last = middle - 1;
                        }
                        middle = (first + last) / 2;
                    }
                    if (first > last) {
                        System.out.println(item + " is not found.");
                    }
                    break;

                case 24: 
                    System.out.print("Enter value X: ");
                    int x24 = sc.nextInt();
                    System.out.print("Enter value Y: ");
                    int y24 = sc.nextInt();
                    int tempA = x24, tempB = y24;
                    
                    while (tempB != 0) {
                        int t = tempB;
                        tempB = tempA % tempB;
                        tempA = t;
                    }
                    int hcf = tempA;
                    int lcm = (x24 * y24) / hcf;
                    System.out.println("HCF = " + hcf + "\nLCM = " + lcm);
                    break;

                case 25: 
                    System.out.print("Enter side length of cube: ");
                    int side = sc.nextInt();
                    System.out.println("Volume of Cube: " + (float)(side * side * side));
                    break;

                case 26: 
                    System.out.print("Enter number to reverse: ");
                    int num26 = sc.nextInt();
                    int rev26 = 0;
                    
                    while (num26 > 0) {
                        rev26 = (rev26 * 10) + (num26 % 10);
                        num26 /= 10;
                    }
                    System.out.println("Reverse = " + rev26);
                    break;

                case 27: 
                    System.out.print("Enter number to convert to Roman: ");
                    int num27 = sc.nextInt();
                    System.out.println(num27 + " ---> " + intToRoman(num27));
                    break;

                case 28: 
                    System.out.print("Enter your sentence text: ");
                    String str28 = sc.nextLine();
                    int wordCount = 1;
                    
                    for (int i = 0; i < str28.length() - 1; i++) {
                        if ((str28.charAt(i) == ' ') && (str28.charAt(i + 1) != ' ')) {
                            wordCount++;
                        }
                    }
                                    case 28:
                    System.out.println("Number of words in a string = " + wordCount);
                    break;

                case 29:
                    System.out.print("Enter line text to search duplicate words: ");
                    String input29 = sc.nextLine();
                    String[] words29 = input29.split(" ");
                    System.out.println("Duplicate Analysis Breakdown:");
                    
                    for (int i = 0; i < words29.length; i++) {
                        int wrc = 1;
                        for (int j = i + 1; j < words29.length; j++) {
                            if (words29[i].equals(words29[j])) {
                                wrc++;
                                words29[j] = "0";
                            }
                        }
                        if (!words29[i].equals("0")) {
                            System.out.println(words29[i] + "--" + wrc);
                        }
                    }
                    break;

                case 30:
                    System.out.print("Enter text line: ");
                    String input30 = sc.nextLine();
                    String[] words30 = input30.split(" ");
                    System.out.print("Processed text without duplicates: ");
                    
                    for (int i = 0; i < words30.length; i++) {
                        if (words30[i] != null) {
                            for (int j = i + 1; j < words30.length; j++) {
                                if (words30[i].equals(words30[j])) {
                                    words30[j] = null;
                                }
                            }
                            System.out.print(words30[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 31:
                    System.out.print("Enter testing string: ");
                    String input31 = sc.nextLine();
                    countWordsBreakdown(input31);
                    break;

                case 32:
                    System.out.print("Enter target string context: ");
                    String inpStr32 = sc.nextLine();
                    String revStr32 = new StringBuilder(inpStr32).reverse().toString();
                    
                    if (inpStr32.equalsIgnoreCase(revStr32)) {
                        System.out.println("The given string is a Palindrome");
                    } else {
                        System.out.println("The given string is not a Palindrome");
                    }
                    break;

                case 33:
                    System.out.print("Enter string to strip vowels: ");
                    String input33 = sc.nextLine();
                    System.out.println("Stripped Result: " + input33.replaceAll("[AaEeIiOoUu]", ""));
                    break;

                case 34:
                    System.out.print("Enter text string: ");
                    String str34 = sc.nextLine();
                    StringBuilder res34 = new StringBuilder();
                    
                    for (String w : str34.split("\\s")) {
                        if (w.length() > 0) {
                            res34.append(Character.toUpperCase(w.charAt(0)))
                                  .append(w.substring(1))
                                  .append(" ");
                        }
                    }
                    System.out.println("Capitalized Output: " + res34.toString().trim());
                    break;

                case 35:
                    System.out.print("Enter comma separated elements: ");
                    String input35 = sc.nextLine();
                    
                    for (String chunk : input35.split(",")) {
                        System.out.println(chunk.trim());
                    }
                    break;
                case 36:
                    System.out.print("Enter alpha string data: ");
                    String str36 = sc.nextLine();
                    getOccuringChar(str36);
                    break;

                case 0:
                    System.out.println("Exiting Mega Compiler Program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input! Select an options range from 0 to 36.");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void pw(int n, String ch) {
        String[] one = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                         " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen" };
        String[] ten = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety" };
        
        if (n > 19) {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        } else {
            System.out.print(one[n]);
        }
        if (n > 0) {
            System.out.print(ch);
        }
    }

    private static String intToRoman(int num) {
        romanMap.put(1, "I");   romanMap.put(4, "IV");   romanMap.put(5, "V");   romanMap.put(9, "IX");
        romanMap.put(10, "X");  romanMap.put(40, "XL");  romanMap.put(50, "L");  romanMap.put(90, "XC");
        romanMap.put(100, "C"); romanMap.put(400, "CD"); romanMap.put(500, "D"); romanMap.put(900, "CM");
        romanMap.put(1000, "M");
        
        StringBuilder result = new StringBuilder();
        for (int i : bases) {
            while (num >= i) {
                result.append(romanMap.get(i));
                num -= i;
            }
        }
        return result.toString();
    }

    private static void countWordsBreakdown(String st) {
        String[] words = st.split("\\s+");
        int[] fr = new int[words.length];
        
        for (int i = 0; i < words.length; i++) {
            fr[i] = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    fr[i]++;
                    words[j] = "";
                }
            }
        }
        
        int total = 0;
        System.out.println("Words and words count:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                System.out.println(words[i] + " = " + fr[i]);
                total += fr[i];
            }
        }
        System.out.println("Total words counted: " + total);
    }

    private static void getOccuringChar(String str) {
        int[] count = new int[MAX_CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        boolean[] printed = new boolean[MAX_CHAR];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!printed[ch]) {
                System.out.println("Number of Occurrence of " + ch + " is: " + count[ch]);
                printed[ch] = true;
            }
        }
    }
}


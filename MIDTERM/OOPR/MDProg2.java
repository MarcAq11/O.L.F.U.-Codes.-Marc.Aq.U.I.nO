import java.util.Scanner;

public class MDProg2 {
    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n==================================================");
            System.out.println("   MIDTERM PROGRAMMING ACTIVITIES COMPILATION");
            System.out.println("==================================================");
            System.out.print("Enter Activity Number to run (1-31) or 0 to Exit: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }
            
            int activity = scanner.nextInt();
            if (activity == 0) {
                System.out.println("Exiting compilation program. Goodbye!");
                break;
            }
            
            System.out.println("--------------------------------------------------");
            System.out.println("Executing Activity #" + activity + ":");
            System.out.println("--------------------------------------------------");
            
            switch (activity) {
                case 1: runActivity1(scanner); break;
                case 2: runActivity2(scanner); break;
                case 3: runActivity3(scanner); break;
                case 4: runActivity4(scanner); break;
                case 5: runActivity5(scanner); break;
                case 6: runActivity6(scanner); break;
                case 7: runActivity7(scanner); break;
                case 8: runActivity8(scanner); break;
                case 9: runActivity9(scanner); break;
                case 10: runActivity10(scanner); break;
                case 11: runActivity11(); break;
                case 12: runActivity12(); break;
                case 13: runActivity13(); break;
                case 14: runActivity14(scanner); break;
                case 15: runActivity15(scanner); break;
                case 16: runActivity16(scanner); break;
                case 17: runActivity17(scanner); break;
                case 18: runActivity18(scanner); break;
                case 19: runActivity19(scanner); break;
                case 20: runActivity20(scanner); break;
                case 21: runActivity21(); break;
                case 22: runActivity22(); break;
                case 23:
                case 25: runActivity23_25(); break;
                case 24: runActivity24(); break;
                case 26: runActivity26(); break;
                case 27: runActivity27(); break;
                case 28: runActivity28(); break;
                case 29: runActivity29(); break;
                case 30: runActivity30(); break;
                case 31: runActivity31(); break;
                default: System.out.println("Activity number out of range! Choose (1-31)."); break;
            }
        }
        scanner.close();
    }

    // --- ACTIVITY METHODS ---

    private static void runActivity1(Scanner sc) {
        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);
        char upperCh = Character.toUpperCase(ch);
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else if (upperCh == 'A' || upperCh == 'E' || upperCh == 'I' || upperCh == 'O' || upperCh == 'U') {
            System.out.println(ch + " is a VOWEL.");
        } else {
            System.out.println(ch + " is a CONSONANT.");
        }
    }

    private static void runActivity2(Scanner sc) {
        System.out.print("Enter date (MM DD YYYY): ");
        int month = sc.nextInt(); int day = sc.nextInt(); int year = sc.nextInt();
        String mWord;
        switch (month) {
            case 1: mWord = "January"; break; case 2: mWord = "February"; break;
            case 3: mWord = "March"; break; case 4: mWord = "April"; break;
            case 5: mWord = "May"; break; case 6: mWord = "June"; break;
            case 7: mWord = "July"; break; case 8: mWord = "August"; break;
            case 9: mWord = "September"; break; case 10: mWord = "October"; break;
            case 11: mWord = "November"; break; case 12: mWord = "December"; break;
            default: mWord = "Invalid Month"; break;
        }
        if (mWord.equals("Invalid Month")) System.out.println("Invalid date entered.");
        else System.out.println(mWord + " " + day + ", " + year);
    }

    private static void runActivity3(Scanner sc) {
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp < 0) System.out.println("ICE");
        else if (temp <= 100) System.out.println("WATER");
        else System.out.println("STEAM");
    }

    private static void runActivity4(Scanner sc) {
        System.out.print("Enter speed (km/h): "); double speed = sc.nextDouble();
        System.out.print("Enter length (meters): "); double len = sc.nextDouble();
        if (speed > 1100 && len > 52) System.out.println("civilian");
        else if (speed <= 500 && len <= 20) System.out.println("military");
        else if (speed < 500) System.out.println("It's a bird");
        else System.out.println("Unclassified");
    }

    private static void runActivity5(Scanner sc) {
        System.out.print("Enter Class ID: ");
        char id = sc.next().charAt(0);
        switch (Character.toLowerCase(id)) {
            case 'b': System.out.println("Battleship"); break;
            case 'c': System.out.println("Cruiser"); break;
            case 'd': System.out.println("Destroyer"); break;
            case 'f': System.out.println("Frigate"); break;
            default: System.out.println("Unknown Class"); break;
        }
    }

    private static void runActivity6(Scanner sc) {
        System.out.print("Enter Richter Scale number: ");
        double n = sc.nextDouble();
        if (n < 5.0) System.out.println("Little or no damage");
        else if (n < 5.5) System.out.println("Some damage");
        else if (n < 6.5) System.out.println("Serious damage");
        else if (n < 7.5) System.out.println("Disaster");
        else System.out.println("Catastrophe");
    }

    private static void runActivity7(Scanner sc) {
        System.out.print("Enter a number (Max 3000): ");
        int num = sc.nextInt();
        if (num <= 0 || num > 3000) { System.out.println("Out of range!"); return; }
        
        String result = "";
        if (num >= 1000) { result += units[num / 1000] + " thousand "; num %= 1000; }
        if (num >= 100) { result += units[num / 100] + " hundred "; num %= 100; }
        if (num > 0) {
            if (num < 20) result += units[num];
            else result += tens[num / 10] + " " + units[num % 10];
        }
        System.out.println(result.trim());
    }

    private static void runActivity8(Scanner sc) {
        System.out.print("Enter a number (Max 3000): ");
        int num = sc.nextInt();
        if (num <= 0 || num > 3000) { System.out.println("Out of range!"); return; }
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vals.length; i++) {
            while (num >= vals[i]) { num -= vals[vals[i] == num ? i : i]; sb.append(roms[i]); }
        }
        System.out.println(sb.toString());
    }

    private static void runActivity9(Scanner sc) {
        System.out.print("Enter tuition fee: "); double fee = sc.nextDouble();
        System.out.print("Enter mode of payment (1-Cash, 2-2-Inst, 3-3-Inst): "); int plan = sc.nextInt();
        if (plan == 1) fee *= 0.90; else if (plan == 2) fee *= 0.05; else if (plan == 3) fee *= 1.10;
        System.out.println("Your total tuition fee is: " + (int)fee);
    }

    private static void runActivity10(Scanner sc) {
        System.out.print("Enter percentile grade: "); int g = sc.nextInt();
        if (g >= 98 && g <= 100) System.out.println("1.00");
        else if (g >= 95) System.out.println("1.25");
        else if (g >= 92) System.out.println("1.50");
        else if (g >= 89) System.out.println("1.75");
        else if (g >= 85) System.out.println("2.00");
        else if (g >= 82) System.out.println("2.25");
        else if (g >= 80) System.out.println("2.50");
        else if (g >= 77) System.out.println("2.75");
        else if (g >= 75) System.out.println("3.00");
        else System.out.println("Out-of-Range");
    }

    private static void runActivity11() {
        System.out.println("Sequence nos. Squared");
        for (int i = 1; i <= 5; i++) System.out.println(i + " " + (i * i));
    }

    private static void runActivity12() {
        int l = 1, r = 5;
        for (int i = 0; i < 5; i++) System.out.print(l++ + ", " + r-- + ", ");
        System.out.println();
    }

    private static void runActivity13() {
        int l = 5, r = 1;
        for (int i = 0; i < 5; i++) System.out.print(l-- + ", " + r++ + ", ");
        System.out.println();
    }

    private static void runActivity14(Scanner sc) {
        System.out.print("Enter a no.: "); int n = sc.nextInt();
        int fact = 1; for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial value : " + fact);
    }

    private static void runActivity15(Scanner sc) {
        System.out.print("Enter a no.: "); int n = sc.nextInt();
        int t1 = 1, t2 = 1; System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; ++i) { 
            System.out.print(t1 + " "); 
            int s = t1 + t2; 
            t1 = t2; 
            t2 = s; 
        }
        System.out.println();
    }

    private static void runActivity16(Scanner sc) {
        System.out.print("Enter base: "); 
        int b = sc.nextInt();
        System.out.print("Enter exponent: "); 
        int e = sc.nextInt();
        
        int res = 1; 
        for (int i = 0; i < e; i++) {
            res *= b;
        }
        System.out.println("Power value: " + res);
    }

    private static void runActivity17(Scanner sc) {
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();
        
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println("Output: " + sum);
    }

    private static void runActivity18(Scanner sc) {
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();
        
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Output: " + sum);
    }

    private static void runActivity19(Scanner sc) {
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();
        
        int rev = 0; 
        while (n != 0) { 
            rev = rev * 10 + (n % 10); 
            n /= 10; 
        }
        System.out.println("Reverse number: " + rev);
    }

    private static void runActivity20(Scanner sc) {
        System.out.print("Enter a number: "); 
        int n = sc.nextInt();
        
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long p = 1; 
            for (int j = 1; j <= i; j++) {
                p *= i;
            }
            sum += p;
        }
        System.out.println("Output: " + sum);
    }

    private static void runActivity21() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void runActivity22() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            int p = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) { 
                System.out.print(p + " "); 
                p = (p == 1) ? 0 : 1; 
            }
            System.out.println();
        }
    }

    private static void runActivity23_25() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void runActivity24() {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void runActivity26() {
        int r = 4, num = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    private static void runActivity27() {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    private static void runActivity28() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void runActivity29() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void runActivity30() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void runActivity31() {
        int r = 5;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

public class Wk7P5 {
    public static void main(String[] args) {
        System.out.println("OUTPUT :");

        for (int i = 1; i <= 4; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
                if (j < i) {
                    System.out.print("A");
                }
            }
            
            System.out.println();
        }
    }
}

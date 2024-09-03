import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the num :");
        Scanner j = new Scanner(System.in);
        int n = j.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println(a);
                c = a + b;
                a = b;
                b = c;
            }
            
            
        }
    }
}
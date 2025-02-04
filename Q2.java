import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        // Write a program to find power of any number x ^ y.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ans = 1;

        while(y > 0){
            ans *= x;
            y--;
        }

        System.out.println(ans);
    }
}

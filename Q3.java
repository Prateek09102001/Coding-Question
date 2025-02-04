import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        // Write a program to enter any number and calculate its square root.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ans = Math.sqrt(n);

        System.out.println(ans);
    }
}

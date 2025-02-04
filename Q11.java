import java.util.Scanner;

public class Q11 {
    // Write a program to print a multiplication table of any number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i * n);
        }
    }
}

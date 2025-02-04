import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        // Write a program to swap two numbers without using a third variable.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x+" "+y);
        
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x+" "+y);
    }
}

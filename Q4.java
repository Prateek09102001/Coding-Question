import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to swap two numbers.
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x+" "+y);
        
        int temp = x;
        x = y;
        y = temp;

        System.out.println(x+" "+y);
    }
}

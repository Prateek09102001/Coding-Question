import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        // Write a program to convert days into years, weeks and days.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Equivalent Time: ");
        System.out.println(years + " years, " + weeks + " weeks, and " + days + " days");
    }
}

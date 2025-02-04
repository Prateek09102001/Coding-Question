import java.util.Scanner;

public class Q12 {
    // Write a program to swap first and last digits of a number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 10) {
            System.out.println("Number must have at least two digits.");
            return;
        }

        int lastDigit = number % 10;
        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));

        int digits = (int) Math.log10(number);

        int middlePart = number % (int) Math.pow(10, digits);
        middlePart = middlePart / 10;

        int swappedNumber = lastDigit * (int) Math.pow(10, digits) + middlePart * 10 + firstDigit;

        System.out.println("Number after swapping first and last digits: " + swappedNumber);
    }
}

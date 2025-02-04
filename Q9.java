import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1 = " + root1 + "\nRoot 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a), imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i\nRoot 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

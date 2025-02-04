import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("It is an UPPERCASE letter.");
            } else {
                System.out.println("It is a LOWERCASE letter.");
            }

            char lowerCh = Character.toLowerCase(ch); 
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("It is a VOWEL.");
            } else {
                System.out.println("It is a CONSONANT.");
            }
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }

        scanner.close();
    }
}

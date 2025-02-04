import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Denominations of Indian currency
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Counting the number of notes required
        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i];  // Number of notes for current denomination
                amount = amount % notes[i];         // Remaining amount
            }
        }

        // Displaying the total number of notes
        System.out.println("Total number of notes:");

        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println(notes[i] + " : " + noteCount[i]);
            }
        }

        scanner.close();
    }
}

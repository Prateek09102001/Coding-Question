import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to find the second maximum between four numbers.
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > firstMax){
                secMax = firstMax;
                firstMax = arr[i];
            }
        }

        System.out.println(secMax);
    }
}

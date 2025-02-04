import java.util.Scanner;

class Q23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = findSum(arr, 0, n);
        System.out.println("Sum of array elements: " + sum);
        sc.close();
    }

    static int findSum(int[] arr, int index, int n) {
        if (index == n) return 0;
        return arr[index] + findSum(arr, index + 1, n);
    }
}

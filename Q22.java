import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, sc, 0, n);
        System.out.println("Array elements:");
        printArray(arr, 0, n);
        sc.close();
    }

    static void readArray(int[] arr, Scanner sc, int index, int n) {
        if (index == n) return;
        arr[index] = sc.nextInt();
        readArray(arr, sc, index + 1, n);
    }

    static void printArray(int[] arr, int index, int n) {
        if (index == n) return;
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1, n);
    }
}

import java.util.HashMap;
import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : frequencyMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Total number of duplicate elements: " + duplicateCount);
        sc.close();
    }
}

import java.util.HashMap;
import java.util.Scanner;

class Q47 {
    public static void findOddOccurrenceElements(int[] A) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : A) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
    
            for (var entry : frequencyMap.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int n = sc.nextInt();
            int[] A = new int[n];
    
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
    
            findOddOccurrenceElements(A);
        sc.close();
    }
}

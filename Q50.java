import java.util.Scanner;

class Q50 {
    public static int solution(int[] A) {
            int N = A.length;
            long sumTotal = (long)(N + 1) * (N + 2) / 2;
            long sumArray = 0;
    
            for (int i = 0; i < N; i++) {
                sumArray += A[i];
            }
    
            return (int)(sumTotal - sumArray);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the size of the array: ");
            int N = scanner.nextInt();
    
            int[] A = new int[N];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
    
            int result = solution(A);

        System.out.println("The missing element is: " + result);

        scanner.close();
    }
}



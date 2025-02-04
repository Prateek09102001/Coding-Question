import java.util.Scanner;

class Q30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boolean isIdentity = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1 || i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        System.out.println(isIdentity ? "It is an Identity matrix." : "It is not an Identity matrix.");
        sc.close();
    }
}

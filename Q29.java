import java.util.Scanner;

class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int determinant = determinant(matrix, n);
        System.out.println("Determinant: " + determinant);

        sc.close();
    }

    static int determinant(int[][] matrix, int n) {
        if (n == 1)
            return matrix[0][0];

        int det = 0;
        int sign = 1;
        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            getCofactor(matrix, temp, 0, i, n);
            det += sign * matrix[0][i] * determinant(temp, n - 1);
            sign = -sign;
        }
        return det;
    }

    static void getCofactor(int[][] matrix, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
}

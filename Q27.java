import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];

        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                mat2[i][j] = sc.nextInt();

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];

        System.out.println("Resultant matrix:");
        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}

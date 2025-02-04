import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] matrix = new int[r][c];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        int[][] transpose = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}

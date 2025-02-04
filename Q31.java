import java.util.Scanner;

class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements:");
        int zeroCount = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) zeroCount++;
            }
        }

        int totalElements = r * c;
        System.out.println(zeroCount > totalElements / 2 ? "It is a Sparse matrix." : "It is not a Sparse matrix.");
        sc.close();
    }
}

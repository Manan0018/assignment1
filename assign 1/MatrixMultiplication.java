public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int r1 = a.length, c1 = a[0].length;
        int r2 = b.length, c2 = b[0].length;

        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] res = new int[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];

        for (int[] row : res) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

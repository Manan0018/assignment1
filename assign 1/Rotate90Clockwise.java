public class Rotate90Clockwise {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = m.length;

        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }

        // Reverse rows
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][n - 1 - j];
                m[i][n - 1 - j] = temp;
            }

        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

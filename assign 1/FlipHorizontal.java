public class FlipHorizontal {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int r = m.length, c = m[0].length;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][c - 1 - j];
                m[i][c - 1 - j] = temp;
            }

        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

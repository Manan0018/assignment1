public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int r = m.length;
        int c = m[0].length;

        int[][] t = new int[c][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];

        for (int[] row : t) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

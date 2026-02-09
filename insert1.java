public class insert1 {
  public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

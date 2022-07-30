public class SearchInMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // base condition
        int low = 0;
        int high = matrix[0].length - 1;
        while (low < high) {
            if (matrix[low][high] == target)
                return true;
            else if (matrix[low][high] < target)
                high--;
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(a, 3));
    }
}

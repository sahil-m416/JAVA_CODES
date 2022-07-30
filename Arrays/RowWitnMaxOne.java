public class RowWitnMaxOne {
    public static int findRow(int a[][]) {
        int m = a.length;
        int n = a[0].length;
        int output = -1;
        for (int i = 0; i < m; i++) {
            int ones = 0;
            int maxOnes = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1)
                    ones++;
            }
            if (ones > maxOnes) {
                maxOnes = ones;
                output = i;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // int a[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1, }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 }
        // };
        int a[][] = { { 0, 0 }, { 1, 1, } };
        System.err.println((findRow(a)));
    }
}

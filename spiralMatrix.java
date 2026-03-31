public class spiralMatrix {
    public static void spiralMatrix(int[][] matrix) {
        int sr = 0;
        int ec = matrix[0].length - 1;
        int er = matrix.length - 1;
        int sc = 0;
        int total = matrix.length * matrix[0].length;
        // System.out.println(total);
        int i = 0;
        // while(i!=total)
       while (sr <= er && sc <= ec) {
            // printing starting row
            for (int j = sc; j <= ec; j++) {
                System.out.println(matrix[sr][j]);
                i++;
            }
            sr++;
            // printing nding column
            for (int j = sr; j <= er; j++) {
                System.out.println(matrix[j][ec]);
                i++;
            }
            ec--;
            // printing ending row
            for (int j = ec; j >= sc; j--) {
                System.out.println(matrix[er][j]);
                i++;
            }
            er--;
            // printing starting column
            for (int j = er; j >= sr; j--) {
                System.out.println(matrix[j][sc]);
                i++;
            }
            sc++;

        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
    {1, 2, 3, 4, 5, 6, 7, 8},
    {28, 29, 30, 31, 32, 33, 34, 9},
    {27, 48, 49, 50, 51, 52, 35, 10},
    {26, 47, 60, 61, 62, 53, 36, 11},
    {25, 46, 59, 64, 63, 54, 37, 12},
    {24, 45, 58, 57, 56, 55, 38, 13},
    {23, 44, 43, 42, 41, 40, 39, 14},
    {22, 21, 20, 19, 18, 17, 16, 15}
};
        spiralMatrix(matrix);
    }
}

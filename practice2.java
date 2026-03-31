public class practice2 {
    public static int diagonalSum(int[][]matrix){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            //primary diagonal
            sum+=matrix[i][i];
            //secondary diagonal
            if (i!=matrix.length-i-1) {
                sum+=matrix[i][matrix.length-i-1];    
            }
            
        }
        return sum;
    }
    
    //staircase searching in sorted array
  public static boolean stairSearch(int[][] matrix, int key) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
        if (matrix[row][col] == key) {
            System.out.println("Key found at: (" + row + ", " + col + ")");
            return true;
        } 
        else if (key < matrix[row][col]) {
            col--;
        } 
        else {
            row++;
        }
    }

    System.out.println("Key not found");
    return false;
}

    //transpose of matrix
    public static int[][] transpose(int[][]matrix){
        int[][] transpose=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5, 6, 7, 8 }, { 28, 29, 30, 31, 32, 33, 34, 9 },
                { 27, 48, 49, 50, 51, 52, 35, 10 }, { 26, 47, 60, 61, 62, 53, 36, 11 },
                { 25, 46, 59, 64, 63, 54, 37, 12 }, { 24, 45, 58, 57, 56, 55, 38, 13 },
                { 23, 44, 43, 42, 41, 40, 39, 14 }, { 22, 21, 20, 19, 18, 17, 16, 15 } 
            };
            System.out.println("The sum of diagonals is : "+diagonalSum(matrix));
            stairSearch(matrix, 8);
            int[][] transpose=transpose(matrix);
            for (int i = 0; i < transpose.length; i++) {
                for (int j = 0; j < transpose.length; j++) {
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
    }
}

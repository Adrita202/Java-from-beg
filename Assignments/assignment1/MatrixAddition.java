public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        int[][] b = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = i + j;
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(a);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = i * j;
            }
        }
        System.out.println("Matrix 2:");
        printMatrix(b);
        int[][] result = addMatrices(a, b);
        System.out.println("Matrix Sum (a + b):");
        printMatrix(result);
    }
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class RotateImage {
    public static int[][] RotateClockWise(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix.length - 1;

            while (low <= high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        return matrix;

    }

    public static int[][] RotateAntiClockWise(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int top = 0;
            int bottom = matrix[0].length - 1;
            while (top <= bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
        return matrix;

    }

    public static void Print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original matrix");
        Print(matrix);
        System.out.println();
        System.out.println("matrix rotate clockwise");
        Print(RotateClockWise(matrix));
        System.out.println();
        System.out.println("matrix rotate anticlockwise");
        Print(RotateAntiClockWise(matrix));
    }
}

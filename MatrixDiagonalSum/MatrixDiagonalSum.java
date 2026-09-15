public class MatrixDiagonalSum {
    public static int DiagonalSum(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i = 0 ; i<n; i++){
            sum += matrix[i][i];

            
             if (i != n-1-i) {
                    sum += matrix[i][n-i-1];
                }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
        System.out.println(DiagonalSum(matrix));
    }
}

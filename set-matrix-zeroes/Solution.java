public class Solution {
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowHasZeroes = false;
        boolean firstColHasZeroes = false;

        //marker set
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if (matrix[i][j] == 0) {
                    if(i == 0) firstRowHasZeroes = true;
                    if(j == 0) firstColHasZeroes = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //inner

        for(int i = 1;i<m ; i++){
            for(int j = 1; j<n ; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //check firstrow
        if (firstRowHasZeroes) {
            for(int j = 0 ; j<n ; j++){
                matrix[0][j] = 0;
            }
        }

        //check firstcol
        if (firstColHasZeroes) {
            for(int i = 0 ; i<m ; i++){
                matrix[i][0] = 0;
            }
        }

    }
    public static void printZeroes(int[][] matrix){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        printZeroes(matrix);
        setZeroes(matrix);
        System.out.println();
        System.out.println("After setting zeroes:");
        printZeroes(matrix);
    }
}

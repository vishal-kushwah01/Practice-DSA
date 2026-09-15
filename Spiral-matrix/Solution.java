
import java.util.*;

public class Solution {
     public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endcol && startcol <= endcol) {
            for(int j = startcol ; j<= endcol ; j++){
                result.add(matrix[startrow][j]);
            }

            for(int i = startrow+1; i<= endrow ; i++){
                result.add(matrix[i][endcol]);
            }

            if(startrow < endrow){
                for(int j = endcol - 1 ; j>= startcol ; j--){
                    result.add(matrix[endrow][j]);
                }
            }
            if (startcol < endcol) {
                for(int i = endrow - 1 ; i >= startrow+1 ; i--){
                    result.add(matrix[i][startcol]);
                }
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return result;

        
     }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> output = spiralOrder(matrix);
        System.out.println(output);
        
    }
}

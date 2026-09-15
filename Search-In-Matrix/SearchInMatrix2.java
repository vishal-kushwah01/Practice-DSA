public class SearchInMatrix2 {
    public static boolean Search(int matrix[][] , int target){
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int start = 0;
        int end = (m*n)-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target){
                return true;
            }
            if (matrix[row][col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};
        int target = 7;
        System.out.println(Search(matrix,target));
    }
}

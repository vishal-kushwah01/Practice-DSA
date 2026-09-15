public class TrappingRainwater {
    public static int TrappedWater(int height[]){
        
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];

        //leftmax
        leftmax[0] = height[0];
        for(int i = 1; i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        //rightmax
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2 ;i>=0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        int Trappedwater = 0;
        for(int i = 0; i<height.length ; i++){
            
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            Trappedwater += waterlevel - height[i];
        }
        return Trappedwater;

    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappedWater(height));
    }
}

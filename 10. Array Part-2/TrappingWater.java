public class TrappingWater {
    public static int trapWater(int [] height){
        // ? Left Max
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // ? Right Max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        // ? Water Level & Trapped Water
        int trapWater = 0;
        for(int i = 0; i < n; i++){
            // ? WaterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // ? Trapped Water
            trapWater += waterLevel - height[i];
        }
        return trapWater;        
    }
    public static void main(String[] args) {
        int [] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapWater(height));
    }
}

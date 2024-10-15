public class RainWaterTrapping {
    public static int trappedRainWater(int height[]) {
        // Calculate left max boundary - auxiliary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary - auxiliary array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];  // Fixed initialization
        for (int i = height.length - 2; i >= 0; i--) {  // Fixed loop bounds
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Loop to calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // Water level = minimum of (left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];  // Fixed calculation
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("total trapped water is : "+trappedRainWater(height));  // Output: 9
    }
}

//point to note : here time complexity is O(n) which is very good.
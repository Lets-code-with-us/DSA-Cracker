public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width of the container
            int width = right - left;

            // Calculate the height of the container (minimum of the two line heights)
            int containerHeight = Math.min(height[left], height[right]);

            // Calculate the area of the container
            int area = width * containerHeight;

            // Update the maximum water if the current area is greater
            maxWater = Math.max(maxWater, area);

            // Move the pointers inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] heights1 = {1, 5, 4, 3};
        int[] heights2 = {3, 1, 2, 4, 5};

        System.out.println("Maximum water container for heights1: " + maxArea(heights1));
        System.out.println("Maximum water container for heights2: " + maxArea(heights2));
    }
}

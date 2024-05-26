public class Number4 {
    
    public static int findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int max = nums[0]; 

        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; 
        int maxElement = findMax(nums); 
        System.out.println("The maximum element is: " + maxElement);
    }
}

import java.util.HashMap;

public class Number2 {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for (int i = 0; i < nums.length; i++) {
            
            int complement = target - nums[i];
            
          
            if (map.containsKey(complement)) {
                
                return new int[] { map.get(complement), i };
            }
            
           
            map.put(nums[i], i);
        }
        
        
        return new int[] {};
    }

    
    public static void main(String[] args) {
        Number2 Number2 = new Number2();
        
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
      
        int[] result = Number2.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

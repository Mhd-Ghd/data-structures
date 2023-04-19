import java.util.HashMap;

public class twoSum {
public static int[] twoSum(int[] nums, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    int diff;
    for (int i=0 ;i<nums.length;i++){
        diff = target - nums[i];
        if (map.containsKey(diff)) return new int[] {i,map.get(diff)};    
        map.put(nums[i],i);
    }

}
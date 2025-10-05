import java.util.HashMap;
import java.util.Map;
public class twoSum{
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        int target = 9;
        int[] result = TwoSum(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] TwoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}
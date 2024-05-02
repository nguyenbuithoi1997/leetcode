import java.util.HashMap;
import java.util.Map;

public class MainTwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum[0]+ ','+ twoSum[1]);
    }

    // O(n^2) có 2 vòng lặp for - it have two for loop
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 1; i++) {
            int numI = nums[i];
            int distance = target - numI;
            for (int j = 0; j <= nums.length -1; j++) {
                if (i == j) {
                    continue;
                }
                int numJ = nums[j];
                if (distance == numJ) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // O(n) có 1 vòng lặp for - it have one for loop
    public static int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

}

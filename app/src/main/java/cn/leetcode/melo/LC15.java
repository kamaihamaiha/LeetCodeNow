package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC15 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                -1, 0, 1, 2, -1, -4
        };
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

//        8  -5  2  0 6
        List<List<Integer>> backList = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (nums == null && nums.length < 3) return backList;
            if (nums[i] > 0) return backList;
//            if (nums[i] == nums.get(i + 1)) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    backList.add(Arrays.asList(nums[i], nums[r], nums[l]));
                    //跳过附近的重复值
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                }
            }
        }

        return backList;

    }
}

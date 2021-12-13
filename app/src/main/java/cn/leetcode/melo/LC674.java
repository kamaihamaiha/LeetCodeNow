package cn.leetcode.melo;

/**
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 *
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC674 {
    public static void main(String[] args) {
        findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        int l = 0;
        int r = 1;
        int length = 1;
        int tem = 1;
        for (int i = 0; i < nums.length; i++) {
            while (r < nums.length) {
                if (nums[r] > nums[l]) {
                    length++;
                    r++;
                    l++;
                } else {
                    length=1;
                     l = r;
                    r = l + 1;
                }
                tem=Math.max(length,tem);
            }

        }

        return tem;
    }
}

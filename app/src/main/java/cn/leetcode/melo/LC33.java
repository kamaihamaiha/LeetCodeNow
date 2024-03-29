package cn.leetcode.melo;

/**
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * <p>
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * <p>
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 */
public class LC33 {
    public static void main(String[] args) {

    }

//    public static int search(int[] nums, int target) {
//        int n = nums.length;
//        if (n == 0) {
//            return -1;
//        }
//        if (n == 1) {
//            return nums[0] == target ? 0 : -1;
//        }
//
//        //升序 二分法 找中间值
//        int mid= nums.length/2;
//        int left=mid-1;
//        int right=mid+1;
//        if (left==0&&left< nums.length&&right>=0&&left< nums.length)
//        if (nums[mid]<nums[left]&&nums[mid]<nums[right]){
//            return mid;
//        }
//    }

    public static int search2(int[] nums, int target) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                result = i;
            }
        }
//        if (result == -1) return result;
//        if (result == 0) return result;
//        if (result == nums.length - 1) return result;
//
//        //计算
//        if (nums[result] < nums[result - 1] && nums[result] < nums[result + 1]) {
//            return result;
//        }
        return result;
    }
}

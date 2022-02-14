package cn.leetcode.melo;

public class LC540 {
    public static void main(String[] args) {
        singleNonDuplicate(new int[]{1, 1, 3, 3, 4, 4,5, 8, 8});
    }


    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
         int zuo = 0;
        int you = nums.length - 1;
        //说明在前面
        while (zuo < you) {
            int mid = (you +zuo) / 2;

            //偶数
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    //说明在后面
                    zuo = mid + 1;
                } else {
//                    在前面
                    you = mid;
                }
            } else {


                if (nums[mid-1] == nums[mid ]) {
                    zuo = mid + 1;

                }else {
                    you = mid;

                }
            }

        }

        return nums[zuo];

    }
}

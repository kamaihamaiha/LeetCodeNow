package cn.leetcode.kotlin.melo;

public class ATestJava {
    public static void main(String[] args) throws Exception {
        repeatedSubstringPattern("sss");
        System.out.println(-5 + 1 / 4 + 2 * -3 + 5);

    }
    class Solution {

    }
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }




    public static boolean repeatedSubstringPattern(String s) throws Exception {

        if (s.length()==0) throw   new Exception();





        int n = s.length();
        // 没有 2位数  肯定不是循环的 直接 false  所以只需要循环一半的字符就行了
        for (int i = 1; i * 2 <= n; ++i) {
            // 是这个长度的倍数才有可能
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    // 逐位比较 都对的上的才是 true
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                //找到了 就返回 true ,找不到继续找
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}


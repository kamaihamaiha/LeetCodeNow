package cn.leetcode.kotlin.MeloZhangZhen;

public class ATestJava {
    public static void main(String[] args) {
        repeatedSubstringPattern("sss");
    }


    public static boolean repeatedSubstringPattern(String s) {
        //首先获取长度
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


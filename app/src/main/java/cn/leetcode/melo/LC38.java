package cn.leetcode.melo;

/**
 * 38. 外观数列  递归
 */
public class LC38 {
    public static void main(String[] args) {

    }

    /**
     * 思路分两步,一个是 上到上一个字符串  2 是拿到字符串怎么处理
     *
     * 双指针处理
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        //第一个自然是 1
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        // 拿到上一层的字符串
        String str = countAndSay(n - 1);
        int length = str.length();

// 开始指针为0
        int start = 0;
        // 注意这从起始条件要和下面长度统一
        for (int i = 1; i < length + 1; i++) {
            // 字符串最后一位直接拼接
            if (i == length) {
                res.append(i - start).append(str.charAt(start));
                // 直到start位的字符串和i位的字符串不同，拼接并更新start位
            } else if (str.charAt(i) != str.charAt(start) ) {
                res.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return res.toString();


    }

}

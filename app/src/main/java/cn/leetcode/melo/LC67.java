package cn.leetcode.melo;

/**
 * 67. 二进制求和
 *
 * 遍历加上去 计算进位就行
 *
 * 笨方法可以直接 转 10 进制 算完 转回去,但是效率较低
 */
public class LC67 {


    public static void main(String[] args) {
        String aString = "11";
        String bString = "1";
        String back = addBinary(aString, bString);
//        System.out.println(-5 + 1 / 4 + 2 * -3 + 5);5
    }


    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        //从后面往前加
        int ca = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}

package cn.leetcode.melo;

public class LC504 {
    public static void main(String[] args) {

    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String ans = "";
        boolean isMinus = false;
        //先取出正负号
        if (num < 0) {
            isMinus = true;
            num = -num;
        }
        StringBuffer digits = new StringBuffer();

        while (num > 0) {
            digits.append(num % 7);
            num /= 7;
        }
        if (isMinus) {
            digits.append("-");
        }
        ans = digits.reverse().toString();
        return ans;
    }


}

package cn.leetcode.melo;

public class LC11 {
    public static void main(String[] args) {
        int back = maxArea(new int[]{1, 1});
        System.out.println(back);
    }

    /**
     * 直接双循环 会超时
     * 所以用双指针  无脑循环会浪费内存,取双指针 往中间走,移动短的那根
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int indexA = 0, indexB = height.length - 1;
        int back = 0;

        //两边指针往中间收

        while (indexA < indexB) {
            //谁短移谁
            back = height[indexA] < height[indexB] ?
                    Math.max(back, (indexB - indexA) * height[indexA++]) :
                    Math.max(back, (indexB - indexA) * height[indexB--]);

        }
        return back;
    }
}

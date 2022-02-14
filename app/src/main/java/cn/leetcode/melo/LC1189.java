package cn.leetcode.melo;

import java.util.AbstractMap;

public class LC1189 {
    public static void main(String[] args) {
        maxNumberOfBalloons("nlaebolko");
    }

    public static int maxNumberOfBalloons(String text) {
        int min = Integer.MAX_VALUE;
        int[] back = new int[5];
//        balloon
        char[] charArr = text.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case 'b':
                    back[0]++;
                    break;
                case 'a':
                    back[1]++;
                    break;
                case 'l':
                    back[2]++;
                    break;
                case 'o':
                    back[3]++;
                    break;
                case 'n':
                    back[4]++;
                    break;
            }
        }
        back[2] = back[2] / 2;
        back[3] = back[3] / 2;
//back[0],back[1],back[2],back[3],back[4]

        for (int i = 0; i < back.length; i++) {
            min = Math.min(min, back[i]);
        }
        return min;
    }
}

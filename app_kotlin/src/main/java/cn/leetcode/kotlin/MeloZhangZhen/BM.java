package cn.leetcode.kotlin.MeloZhangZhen;


/**
 * BM算法实现
 */
public class BM {

    /**
     * 算法匹配
     */
    public static int pattern(String pattern, String target) {
        int tLen = target.length();
        int pLen = pattern.length();

        if (pLen > tLen) {
            return -1;
        }
        //坏字 好字
        int[] bad_table = build_bad_table(pattern);// 1,3,5,6,2,
        int[] good_table = build_good_table(pattern);// 1,8,5,10,11,12,13

        for (int i = pLen - 1, j; i < tLen; ) {
            System.out.println("跳跃位置：" + i);
            for (j = pLen - 1; target.charAt(i) == pattern.charAt(j); i--, j--) {
                if (j == 0) {
                    System.out.println("匹配成功，位置：" + i);
//					i++;   // 多次匹配
//					break;
                    return i;
                }
            }
            i += Math.max(good_table[pLen - j - 1], bad_table[target.charAt(i)]);
        }
        return -1;
    }

    /**
     * 字符信息表
     * 假设放入 abc
     */
    public static int[] build_bad_table(String pattern) {
        final int table_size = 256;
        int[] bad_table = new int[table_size];
        //3
        int pLen = pattern.length();
        //一共 256 个字符   都换成这个的长度
        for (int i = 0; i < bad_table.length; i++) {
            bad_table[i] = pLen;  //默认初始化全部为匹配字符串长度
        }

        for (int i = 0; i < pLen - 1; i++) {
            int k = pattern.charAt(i);
            bad_table[k] = pLen - 1 - i;
        }
//		for (int i : bad_table) {
//			if (i != 7) {
//				System.out.print(i + ",");
//			}
//		}
        return bad_table;
    }

    /**
     * 匹配偏移表。
     *
     * @param pattern 模式串
     * @return
     */
    public static int[] build_good_table(String pattern) {
        int pLen = pattern.length();
        int[] good_table = new int[pLen];
        int lastPrefixPosition = pLen;

        for (int i = pLen - 1; i >= 0; --i) {
            if (isPrefix(pattern, i + 1)) {
                lastPrefixPosition = i + 1;
            }
            good_table[pLen - 1 - i] = lastPrefixPosition - i + pLen - 1;
        }

        for (int i = 0; i < pLen - 1; ++i) {
            int slen = suffixLength(pattern, i);
            good_table[slen] = pLen - 1 - i + slen;
        }
        return good_table;
    }

    /**
     * 前缀匹配
     */
    private static boolean isPrefix(String pattern, int p) {
        int patternLength = pattern.length();
        for (int i = p, j = 0; i < patternLength; ++i, ++j) {
            if (pattern.charAt(i) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 后缀匹配
     */
    private static int suffixLength(String pattern, int p) {
        int pLen = pattern.length();
        int len = 0;
        for (int i = p, j = pLen - 1; i >= 0 && pattern.charAt(i) == pattern.charAt(j); i--, j--) {
            len += 1;
        }
        return len;
    }

}
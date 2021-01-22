package cn.leetcode.melo;

import java.util.ArrayList;

/**
 * 26 进制吧
 *
 *
 * 逻辑有错  暂时不写了
 */
public class LC168 {
    public static void main(String[] args) {
//        HashMap<Integer,String> mMap= new HashMap();


        convertToTitle(27);
    }

    public static String convertToTitle(int n) {

        ArrayList<String> az = new ArrayList<>();
        az.add("A");
        az.add("B");
        az.add("C");
        az.add("D");
        az.add("E");

        az.add("F");
        az.add("G");
        az.add("H");
        az.add("I");
        az.add("G");

        az.add("K");
        az.add("L");
        az.add("M");
        az.add("N");
        az.add("O");

        az.add("P");
        az.add("Q");
        az.add("R");
        az.add("S");
        az.add("T");

        az.add("U");
        az.add("V");
        az.add("W");
        az.add("X");
        az.add("Y");
        az.add("Z");
        StringBuffer sb = new StringBuffer("");

        return getString(sb, n, az);


    }

    private static String getString(StringBuffer sb, int n, ArrayList<String> az) {

        if (n > 26) {

            getString(sb, n / 26 , az);

            sb.append(az.get(n%26 - 1)).toString();
        } else if (!(n < 0)) {
            return sb.append(az.get(n - 1)).toString();
        }

        return sb.reverse().toString();

    }

}

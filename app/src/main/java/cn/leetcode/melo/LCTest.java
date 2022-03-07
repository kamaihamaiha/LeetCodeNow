package cn.leetcode.melo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LCTest {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        ArrayList<Integer> allInt = new ArrayList<>();
//        all.add(1);//报错 报异常转到编译异常
        all.add("1");

        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println(classStringArrayList.toString() + "相同");
        }

//        List<?extends Collection> list = new ArrayList();
        List<Collection> list = new ArrayList();
        list.add(new ArrayList());
        getQQQ(Class.class);


//        if (stringArrayList instanceof ArrayList<String>) { }
        if (stringArrayList instanceof ArrayList) {

        }
    }


    public static <A> A getQQQ(Class<A> tClass) {
        A instance = null;
        try {
            instance = tClass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

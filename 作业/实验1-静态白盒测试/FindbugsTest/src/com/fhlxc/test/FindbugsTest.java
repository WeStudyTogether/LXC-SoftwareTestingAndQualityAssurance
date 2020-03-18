package com.fhlxc.test;

import java.security.SecureRandom;
import java.util.Random;

/**
* @author Xingchao Long
* @date 2020年3月17日 下午10:52:10
* @classname FindbugsTest
* @description 
*/
public class FindbugsTest {

    public static void func1() {
        String str = "check_string";
        if (str != null) {
            System.out.println(str);
        }
    }
    
    private static void func2() {
        System.out.println("chekc fun");
    }
    
    private static String strAb = "";
    
    private static String func3() {
        return strAb;
    }
    
    public static void func4() {
        String str = "software testing.";
        System.out.println(str);
        ;
    }
    
    public static void func5() {
        String str1 = "123";
        String str2 = "456";
        String str3 = String.format("{0} {1}", str1, str2);
        System.out.println(str3);
    }
    
    public static void func6() {
        String str = "function 4";
        System.out.println(str.toString());
    }
    
    private static SecureRandom sRandom = new SecureRandom();
    
    public static int func7(int seed) {
        return sRandom.nextInt();
    }
    
    public static void func8() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void func9() {
        String str = "123";
        StringBuffer strb = new StringBuffer("123");
        System.out.println(str.equals(strb.toString()));
    }
    
    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5();
        func6();
        func7(10);
        func8();
        func9();
    }

}

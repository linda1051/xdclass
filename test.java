package com.xdclass.com.xdclass.test;

public class test {

    public static int num;

    public static void main(String[] args) {
        hello();
    }

    public static void hello(){
        for (int i = 0; i < 100; i++) {
            if (i == 98) {
                new NullPointerException("空指针异常");
                num = i;
                System.out.println(num );
            }
        }
    }
}


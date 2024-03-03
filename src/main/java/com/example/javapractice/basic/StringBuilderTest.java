package com.example.javapractice.basic;

public class StringBuilderTest {

    public static void main(String[] args) {
        //字串物件一旦建立，就無法更動任何內容，沒有任何方法可以更動字串內容。
        String name1 =  "Java";
        String name2 = name1 + "World";
        System.out.println(name2);
        //此與下列相同
        String s1 =  "Java";
        String s2 = (new StringBuilder()).append(s1).append("World").toString();
        System.out.println(s2);

        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i <100 ; i++) {
            sb.append(i).append("+");
        }
        System.out.println(sb.toString());

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i <100 ; i++) {
            sbf.append(i).append("+");
        }
        System.out.println(sbf.toString());

    }
}

package cn.itcast.test;

import java.util.Scanner;

public class hahahah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine().replaceAll(" ", "");

            StringBuffer sb = new StringBuffer(s);

            String rs = sb.reverse().toString().replaceAll("(.)(?=.*\\1)", "");

            StringBuffer out = new StringBuffer(rs);

            System.out.println(out.reverse().toString());
        }
    }
}

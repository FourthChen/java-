package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class demo04RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int random= r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); //键盘输入的

            if (random < guessNum) {
                System.out.println("你猜大了！");

            } else if (random > guessNum) {
                System.out.println("你猜小了");

            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}

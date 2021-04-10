package com.lumi;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("请输入小明的分数1：");
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();

        //数据测试：正确数据，边界数据，错误数据；

        if (score1 > 100 || score1 < 0) {
            System.out.println("你输入的分数有误");
        } else if (score1 >= 95 && score1 <= 100) {
            System.out.println("小明的礼物是：Bike");
        } else if (score1 >= 90 && score1 <= 94) {
            System.out.println("小明的礼物是：toy");
        } else if (score1 >= 80 && score1 <= 89) {
            System.out.println("小明的礼物是：机器人");
        } else {
            System.out.println("小明的礼物是：被揍");
        }

        System.out.println("好无聊");
        System.out.println("你无聊吗？");

    }

}
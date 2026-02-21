package com.learning.basic;

import java.util.Scanner;

/**
 * ClassName: Basic01Exercise
 * Package: com.learning.basic
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 14/2/2026
 */
public class Basic01Exercise {

    static void main() {
        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.printDiamondPattern11();
        System.out.println("++++++++++++++++");
        diamondPattern.printDiamondPattern();

        Scanner s = new Scanner(System.in);
        System.out.print("整数：" );
        int num = s.nextInt();
        System.out.println(num);
        System.out.print("浮点数：");
        double num1 = s.nextDouble();
        System.out.println(num1);
        System.out.print("请输入你的姓名：");

        // 这里有个坑，需要先执行一次s.nextLine()来消耗掉上一个输出遗留的\n
        s.nextLine();
        String name  = s.nextLine();
        System.out.println("你的姓名是：" + name);

    }
}

class DiamondPattern {
    // 打印一个菱形，此方法适用于Java11及以上版本
    void printDiamondPattern11(){
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ".repeat(4 - i) + "*".repeat(2 * i - 1));
        }
        for (int i = 3; i >= 1; i--) {
            System.out.println(" ".repeat(4 - i) + "*".repeat(2 * i - 1));
        }
    }

    // 另一种方法，此方法适用于Java8版本
    void printDiamondPattern(){
        int n = 4; // 菱形上半部分的高度（包括中间行）

        // 1. 打印上半部分（1 到 4 行）
        for (int i = 1; i <= n; i++) {
            // 打印空格：每行空格数 = 总行数 - 当前行号
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号：每行星号数 = 2 * 当前行号 - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 打印下半部分（剩余的 3 行）
        for (int i = n - 1; i >= 1; i--) {
            // 打印空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

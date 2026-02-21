package com.learning.basic;

import java.util.Scanner;

/**
 * ClassName: BasicExercise02
 * Package: com.learning.basic
 * Description
 *
 * @Author: Steven_LIU
 * @Create: 21/2/2026
 */
public class BasicExercise02 {
    static void main() {
        BasicExercise02 be02 = new BasicExercise02();
        // be02.calculatePositiveInteger();
        // be02.printOddNumber(2,100);
        be02.countSoldier();
    }

    // 从键盘上接收输入的正整数或负整数，只计算正整数的和，如果输入为0，则退出程序
    void calculatePositiveInteger(){
        Scanner scanner = new Scanner(System.in);
        int input, value = 0;
        do {
            System.out.println("请输入一个整数：");
            input = scanner.nextInt();
            if (input > 0) {
                value += input;
            }
        } while (input != 0);
        System.out.println(value);
        scanner.close();
    }

    // 打印出从startNum-endNum内的所有奇数，但跳过以3结尾的数
    void printOddNumber(int startNum, int endNum){
        // 参数验证
        if (startNum > endNum) {
            System.out.println("起始值不能大于结束值");
            return;
        }

        for (int i = (startNum % 2 == 0)? startNum + 1:startNum; i <= endNum; i += 2) {
            if ( i % 10 != 3) {
                System.out.println(i);
            }
        }
    }

    // 韩信点兵，3人一组余2人，5人一组余3人，7人一组余4人，需要至少多少人？
    void countSoldier(){
        int minAmountSoldier = 1;
        while (true) {
            if (minAmountSoldier % 3 == 2 && minAmountSoldier % 5 == 3 && minAmountSoldier % 7 == 4) {
                System.out.println(minAmountSoldier);
                break;
            }
            minAmountSoldier++;
        }
    }

    // 步长优化版本一，原理： 既然要满足 n % 3 == 2，那么 n 只能是 2, 5, 8, 11...（每次+3）
    void optimisedCountSoldier(){
        // 从满足第一个条件的数开始：2, 5, 8, 11...
        int minAmountSoldier = 2;

        while (true) {
            if (minAmountSoldier % 5 == 3 && minAmountSoldier % 7 == 4) {
                System.out.println("至少需要: " + minAmountSoldier + " 人");
                break;
            }
            minAmountSoldier += 3;  // 步长为3，保证始终满足 % 3 == 2
        }
    }

    // 步长优化版本二，原理： 同时满足 n % 3 == 2 和 n % 5 == 3 的数，公差为 15
    void optimisedCountSoldier2(){
        int minAmountSoldier = 8;

        while (true) {
            if (minAmountSoldier % 7 == 4) {
                System.out.println("至少需要: " + minAmountSoldier + " 人");
                break;
            }
            minAmountSoldier += 15;  // 步长为15 (3×5)，保证满足前两个条件
        }
    }
}

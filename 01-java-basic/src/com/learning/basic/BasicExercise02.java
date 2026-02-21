package com.learning.basic;

import java.util.Scanner;

/**
 * ClassName: BasicExercise02
 * Package: com.learning.basic
 * Description: 从键盘上接收输入的正整数或负整数，只计算正整数的和，如果输入为0，则退出程序
 *
 * @Author: Steven_LIU
 * @Create: 21/2/2026
 */
public class BasicExercise02 {
    static void main() {
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
    }
}

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
        be02.printOddNumber(2,100);
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
        for (int i = (startNum % 2 == 0)? startNum + 1:startNum; i <= endNum; i += 2) {
            if ( i % 10 != 3) {
                System.out.println(i);
            }
        }
    }
}

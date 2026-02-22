package com.learning.basic;

/**
 * ClassName: BasicExercise03
 * Package: com.learning.basic
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 21/2/2026
 */
public class BasicExercise03 {
    static void main() {
        BasicExercise03 be03 = new BasicExercise03();
        be03.calculatePeachAmount();
        System.out.println(be03.peachCount(1));
        be03.monkAmount();
    }

    // 猴子第1天摘了若干个桃子，当即吃了一半又一个，第2天又吃了一半又一个，以后每天吃剩下的一半又一个，到第10天的时候发现只剩下了一个桃子，问一共有多少个桃子
    void calculatePeachAmount() {
        int amount = 1;
        for (int i = 0; i < 9; i++) {
            amount = (amount + 1) * 2;
        }
        System.out.println(amount);
    }

    // 猴子吃桃 - 递归解法
    int peachCount(int day) {
        if (day == 10) {
            return 1;
        }
        return (peachCount(day + 1) + 1) * 2;
    }

    // 100个和尚吃了100个馒头，100个和尚有大和尚也有小和尚，其中大和尚一个人可以吃3个馒头，3个小和尚吃1个馒头，问大和尚和小和尚各有多少？
    void monkAmount() {
        int i = 2;
        while ((3 * i + (100 - i) / 3 != 100)) {
            i++;
        }
        System.out.println("大和尚的人数是： " + i);
        System.out.println("小和尚的人数是： " + (100 - i));
    }
}

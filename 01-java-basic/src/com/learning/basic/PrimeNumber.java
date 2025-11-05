package com.learning.basic;

/**
 * ClassName: PrimeNumber
 * Package: com.learning.basic
 * Description: 计算给定范围内质数的个数及计算所需时间
 *
 * @Author: Steven_LIU
 * @Create: 5/11/2025
 */
public class PrimeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("花费的时间为：" + (end - start));
    }
}

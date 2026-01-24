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
    static void main() {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
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
        System.out.println("一万以内质数的个数为：" + count);
        System.out.println("花费的时间为：" + (end - start));
    }
}

class OptimizedSieve {

    /**
     * 返回 [1, n] 范围内的质数个数
     */
    public static int countPrimes(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;

        // 初始：2 是质数，3~n 中的奇数先假设都是质数
        // 偶数（除2外）直接视为合数，不参与筛
        int count = 1; // 2 是质数

        // isPrime[i] 表示数字 i 是否为质数（只关心奇数，但数组包含所有数以便索引）
        boolean[] isPrime = new boolean[n + 1];

        // 初始化：标记所有奇数为 true（偶数保持 false）
        for (int i = 3; i <= n; i += 2) {
            isPrime[i] = true;
        }

        // 从 3 开始，只遍历奇数
        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i]) {
                // 从 i*i 开始筛，步长为 2*i（确保只筛奇数倍）
                // 例如 i=3: 筛 9, 15, 21, 27...（跳过 12, 18 等偶数）
                for (long j = (long) i * i; j <= n; j += 2 * i) {
                    if (isPrime[(int) j]) {
                        isPrime[(int) j] = false;
                        count--;
                    }
                }
            }
        }

        // 补充：加上所有未被筛掉的奇质数（上面只在筛的时候减，但初始 count 未设全）
        // 更简单的方式：重新计算 count（避免逻辑复杂）
        // 实际上，上面“边筛边减”容易出错，我们改用更清晰的方式：
        // —— 先不边筛边减，最后快速统计奇数中的 true

        // 🔄 修正：采用更可靠的方式（清晰 > 微优化）
        count = 1; // 2
        for (int i = 3; i <= n; i += 2) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    // ======================
    // 主方法：测试性能
    // ======================
    public static void main(String[] args) {
        int n = 100_000; // 可改为 1_000_000, 10_000_000 等

        long start = System.currentTimeMillis();
        int count = countPrimes(n);
        long end = System.currentTimeMillis();

        System.out.println("范围: 1 ~ " + n);
        System.out.println("质数个数: " + count);
        System.out.println("耗时: " + (end - start) + " 毫秒");
    }
}

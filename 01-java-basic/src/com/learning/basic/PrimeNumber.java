package com.learning.basic;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ClassName: PrimeNumber
 * Package: com.learning.basic
 * Description: 计算给定范围内质数的个数及计算所需时间
 *
 * @Author: Steven_LIU
 * @Create: 5/11/2025
 */
public class PrimeNumber {

    // 1. 定义类级别的 Logger 实例
    private static final Logger logger = Logger.getLogger(PrimeNumber.class.getName());

    // 2. 添加私有构造方法，隐藏默认的公共构造方法
    // 私有构造方法：阻止外部通过 new PrimeNumber() 实例化此类
    private PrimeNumber() {
        // 可选：抛出异常，进一步防止通过反射实例化
        throw new AssertionError("禁止实例化工具类 PrimeNumber");
    }
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
        logger.log(Level.INFO, "一万以内质数的个数为：{0}", count);
        logger.log(Level.INFO, "花费的时间为：{0}",(end - start));
    }
}

class OptimizedSieve {
    // 1. 定义类级别的 Logger 实例
    private static final Logger logger = Logger.getLogger(OptimizedSieve.class.getName());

    // 2. 添加私有构造方法，隐藏默认的公共构造方法
    // 私有构造方法：阻止外部通过 new OptimizedSieve() 实例化此类
    private OptimizedSieve() {
        // 可选：抛出异常，进一步防止通过反射实例化
        throw new AssertionError("禁止实例化工具类 OptimizedSieve");
    }

    /**
     * 返回 [1, n] 范围内的质数个数
     */
    public static int countPrimes(int n) {
        // 基础边界条件：小于2无质数，等于2只有1个质数
        if (n <= 2) {
            return n == 2 ? 1 : 0;
        }

        // 初始化质数标记数组：默认false（合数），奇数先标记为true（候选质数）
        boolean[] isPrime = new boolean[n + 1];
        initializeOddsAsPrime(isPrime, n);

        // 筛除非质数：只处理奇数，从3开始到√n
        sieveNonPrimes(isPrime, n);

        // 统计所有质数（2 + 奇数中的质数）
        return countPrimeNumbers(isPrime, n);
    }

    /**
     * 初始化数组：将所有奇数标记为候选质数（true）
     * 拆解嵌套逻辑，降低认知复杂度
     */
    private static void initializeOddsAsPrime(boolean[] isPrime, int n) {
        for (int i = 3; i <= n; i += 2) {
            isPrime[i] = true;
        }
    }

    /**
     * 筛除非质数：从i*i开始，步长2*i（只筛奇数倍）
     * 核心筛法逻辑独立成方法，减少嵌套
     */
    private static void sieveNonPrimes(boolean[] isPrime, int n) {
        for (int i = 3; (long) i * i <= n; i += 2) {
            if (isPrime[i]) { // 仅处理未被筛除的质数
                for (long j = (long) i * i; j <= n; j += 2L * i) {
                    isPrime[(int) j] = false;
                }
            }
        }
    }

    /**
     * 统计质数总数：2是唯一的偶质数 + 奇数中的质数
     * 独立统计逻辑，避免边筛边改count的混乱
     */
    private static int countPrimeNumbers(boolean[] isPrime, int n) {
        int count = 1; // 先计入2这个质数
        for (int i = 3; i <= n; i += 2) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    // ======================
    // 主方法：测试性能
    // ======================
   static void main() {
        int n = 100_000; // 可改为 1_000_000, 10_000_000 等

        long start = System.currentTimeMillis();
        int count = countPrimes(n);
        long end = System.currentTimeMillis();

        logger.log(Level.INFO, "范围: 1 ~ {0}",n);
        logger.log(Level.INFO, "质数个数: {0}",count);
        logger.log(Level.INFO, "耗时: {0} 毫秒",(end - start));
    }
}

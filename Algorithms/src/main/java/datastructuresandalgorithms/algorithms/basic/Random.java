package datastructuresandalgorithms.algorithms.basic;

/**
 * Math.random()函数会等概率返回[0,1)之间的小数
 */
public class Random {
    public static void main(String[] args) {
        int N = 1000000;

        int count = 0;
        for (int i=0; i<N; i++) {
            double random = randomA2();
            if (random < 0.5) {
                count++;
            }
        }
        System.out.println((double)count/N);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int positiveNum = 0;
        for (int i=0; i<10000000; i++) {
            double b = Math.random();
            int a = (int) (b * (200 + 1))
                    - 100;
            if (max <a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
            if (a > 0) {
                positiveNum++;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(positiveNum/10000000.0);
    }
    /*
    等概率返回 [m, n] 之间的整数
     */
    public static int randomInteger(int m, int n) {
        int diff = n > m ? 1 : -1;
        return (int)(Math.random()*(n-m+diff)) + m;
    }

    /*
    依然返回[0, 1)之间的小数，要求返回的数在[0, a)之间的概率为a^2
    （Math.random()函数返回的数在[0, a)之间的概率为a）
     */
    public static double randomA2() {
        return Math.max(Math.random(), Math.random());
    }
}

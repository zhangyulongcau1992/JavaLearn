package datastructuresandalgorithms.algorithms.basic;

import java.util.Arrays;

/**
 * ClassName:Bitwise
 * Package:com.zyl.learn.datastructuresandalgorithms.algorithms.basic
 * Description:
 *
 * @Date:2022/2/2 21:23
 * @Author:zhangyulong@qq.com
 */
public class Bitwise {
    public static void main(String[] args) {
        swap(3, 5);
        findOdd(new int[]{1,2,1,2,3,3,4,4,4});
        findOddTwo(new int[]{1,2,1,2,4,3,4,4,4,4,5,6,5,6});
        findDiff(new int[]{4, 3, 1, 3, 3, 1, 1, 4}, 2, 3);
        System.out.println(10 + "只保留最右边的1后，结果为：" + retainRightOne(10));
        System.out.println(20 + "只保留最左边的1后，结果为：" + retainLeftOne(20));
        int a = 778950;
        int b = 3776;
        System.out.println("a = " + a + ", b = " + b + ", a + b = " + add(a, b));
        System.out.println("a = " + a + ", b = " + b + ", a - b = " + minus(a, b));
        System.out.println("a = " + a + ", b = " + b + ", a * b = " + multi(a, b));
        System.out.println("a = " + a + ", b = " + b + ", a / b = " + div(a, b));
        System.out.println("a = " + a + ", b = " + b + ", a / b = " + divide(a, b));
    }

    /**
     * 交换元素
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {
        System.out.println("交换前： a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后： a = " + a + ", b = " + b);
    }

    /**
     * 找到数组中唯一的出现过奇数次的元素
     */
    public static void findOdd (int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println(Arrays.toString(arr) + "唯一出现了奇数次的元素为：" + result);
    }

    /**
     * 找到数组中唯二的出现过奇数次的元素
     */
    public static void findOddTwo (int[] arr) {
        int[] result = new int[2];
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if ((retainRightOne(xor) & arr[i]) > 0) {
                result[0] ^= arr[i];
            }
        }
        result[1] = xor ^ result[0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (((xor ^ arr[i]) ^ arr[j]) == 0) {
//                    result[0] = arr[i];
//                    result[1] = arr[j];
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr) + "唯二出现了奇数次的元素为：" + result[0] + "和" + result[1]);
    }

    /**
     * 对于给定数组arr，其中有一个数出现k次，其余数出现m次，m > k > 0，寻找出现k次的数
     * @param arr
     * @param k
     * @param m
     */
    public static void findDiff(int[] arr, int k, int m) {
        int[] counts = new int[32];
        for (int n : arr) {
            for (int i = 0; i < 32; i++) {
                counts[i] += (n >> i) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((counts[i] % m) == 0) {
                continue;
            }
            if ((counts[i] % m) == k) {
                result |= 1 << i;
            } else {
                System.out.println("输入错误！");
                return;
            }
        }
        System.out.println(Arrays.toString(arr) + "出现次数为" + k + "次的数字为：" + result);
    }

    /**
     * 仅保留输入数字最右边的1
     * @param n
     */
    public static int retainRightOne (int n) {
        int result = n & negNum(n);
        return result;
    }

    /**
     * 仅保留输入数字最左边的1
     * @param n
     */
    public static int retainLeftOne (int n) {
        int temp = n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        n -= n >>>1;
        return n;
    }

    /**
     * 取负数
     * @param a
     * @return
     */
    public static int negNum (int a) {
        return add(~a, 1);
    }


    /**
     * 两数相加
     * @param a
     * @param b
     */
    public static int add (int a, int b) {
        //异或操作可以得到无进位相加结果
        int additionNoCarry = a ^ b;
        //与操作结果左移一位即是进位信息
        int carry = (a & b) << 1;
        int result = additionNoCarry;
        while (carry != 0) {
            additionNoCarry = result ^ carry;
            carry = (result & carry) << 1;
            result = additionNoCarry;
        }
        return result;
    }

    /**
     * 两数相减
     * @param a
     * @param b
     * @return
     */
    public static int minus (int a, int b) {
        int result = add(a, negNum(b));
        return result;
    }

    /**
     * 两数相乘
     * @param a
     * @param b
     * @return
     */
    public static int multi (int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return result;
    }

    /**
     * 两数相除-初始版，算法有错误
     * @param a
     * @param b
     * @return
     */
//    public static int divi (int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException();
//        }
//        int x = a < 0 ? negNum(a) : a;
//        int y = b < 0 ? negNum(b) : b;
//        int result = 0;
//        while (x >= y) {
//            int temp= y;
//            while ( x >= temp) {
//                temp <<= 1;
//            }
//            temp >>>= 1;
//            result += retainRightOne(temp);
//            x = minus(x, temp);
//        }
//        return (a < 0) ^ (b < 0) ? negNum(result) : result;
//    }

    /**
     * 两数相除,当a或者b为Integer.MIN_VALUE时会出错
     * @param a
     * @param b
     * @return
     */
    public static int div (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        int x = a < 0 ? negNum(a) : a;
        int y = b < 0 ? negNum(b) : b;
        int result = 0;
        for (int i = 30; i >= 0; i--) {
            if ((x >> i) >= y) {
                result |= (1 << i);
                x = minus(x, y << i);
            }
        }
        return (a < 0) ^ (b < 0) ? negNum(result) : result;
    }

    /**
     * 两数相除-最终版
     * @param a
     * @param b
     * @return
     */
    public static int divide (int a, int b) {
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return 1;
        }
        if (b == Integer.MIN_VALUE) {
            return 0;
        }
        if (a == Integer.MIN_VALUE) {
            if (b == negNum(1)) {
                return Integer.MAX_VALUE;
            }
            int ans = div(add(a, 1), b);
            return add(ans, div(minus(a, multi(ans, b)), b));
        }
        return div(a, b);
    }
}

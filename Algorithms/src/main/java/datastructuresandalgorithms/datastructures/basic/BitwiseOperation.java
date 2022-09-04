package datastructuresandalgorithms.datastructures.basic;

/**
 * Description: 基础位运算
 */
public class BitwiseOperation {
    public static void main(String[] args) {
        int input = Integer.MIN_VALUE;
        printBinary(input);
        printBinary(input<<2);
        //printBinary(input<<<2);  java中没有无符号左移
        printBinary(input>>2);
        printBinary(input>>>2);
        printBinary(~input);
        printBinary(3&5);
        printBinary(3|5);
        printBinary(3^5);
    }
    //打印输入num的二进制数
    public static void printBinary(int num) {
        for (int i=31; i>=0; i--) {
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void printBinary(long num) {
        for (int i=63; i>=0; i--) {
            System.out.print((num & ((long)1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void printBinary(short num) {
        for (int i=15; i>=0; i--) {
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void printBinary(byte num) {
        for (int i=7; i>=0; i--) {
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void printBinary(char num) {
        for (int i=31; i>=0; i--) {
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}

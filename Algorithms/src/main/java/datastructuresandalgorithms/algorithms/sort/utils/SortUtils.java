package datastructuresandalgorithms.algorithms.sort.utils;


import datastructuresandalgorithms.algorithms.sort.SortInterface;
import datastructuresandalgorithms.utils.CommonUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 排序算法工具类
 */
public class SortUtils {
    private static final int CIRCULATE_TIMES = 10000;
    private static final int MAX_LENGTH = 1000;
    private static final int MAX_VALUE = 1000;

    public static void verify(SortInterface sortMethod) {
        boolean isRight = true;
        int successNum = 0;
        for (int i = 0; i < CIRCULATE_TIMES; i++) {
            int[] arrOrign = CommonUtils.randomArray(MAX_LENGTH, MAX_VALUE);
            int[] arr1 = CommonUtils.arrayCopy(arrOrign);
            int[] arr2 = CommonUtils.arrayCopy(arrOrign);
            sortMethod.sort(arr1);
            Arrays.sort(arr2);
            if (!CommonUtils.arraySame(arr1, arr2)) {
                isRight = false;
                System.out.println("存在错误:");
                System.out.println("原数组：" + Arrays.toString(arrOrign));
                System.out.println("排序后：" + Arrays.toString(arr1));
                System.out.println("应该为：" + arr2);
                System.out.println("成功数：" + successNum + "，总数为：" + CIRCULATE_TIMES);
                break;
            }
            successNum++;
        }
        if (isRight) {
            System.out.println(sortMethod.getClass().getSimpleName() + "算法验证成功！");
        }
    }

    public static void efficiencyCompare(List<SortInterface> sortMethods) {
        long[] takeTimes = new long[sortMethods.size()];
        for (int i = 0; i < CIRCULATE_TIMES; i++) {
            int[] arrOrign = CommonUtils.randomArray(MAX_LENGTH, MAX_VALUE);
            for (int j = 0; j < sortMethods.size(); j++) {
                int[] arr = CommonUtils.arrayCopy(arrOrign);
                long startTime = System.nanoTime();
                sortMethods.get(j).sort(arr);
                long endTime = System.nanoTime();
                takeTimes[j] +=  endTime - startTime;
            }
        }
        for (int i = 0; i < sortMethods.size(); i++) {
            System.out.printf("%15s",sortMethods.get(i).getClass().getSimpleName());
            System.out.print("算法用时为：" + takeTimes[i] + "纳秒。");
            System.out.println();
        }
    }
}

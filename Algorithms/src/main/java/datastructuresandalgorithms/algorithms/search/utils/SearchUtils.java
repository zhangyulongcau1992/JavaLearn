package datastructuresandalgorithms.algorithms.search.utils;


import datastructuresandalgorithms.algorithms.search.SearchInterface;
import datastructuresandalgorithms.utils.CommonUtils;

import java.util.Arrays;

/**
 * ClassName:SearchUtils
 * Package:com.zyl.learn.datastructuresandalgorithms.algorithms.search.utils
 * Description: 查找算法工具类
 *
 * @Date:2022/1/27 21:18
 * @Author:zhangyulong@qq.com
 */
public class SearchUtils {
    private static final int CIRCULATE_TIMES = 10000;
    private static final int MAX_LENGTH = 100;
    private static final int MAX_VALUE = 100;

    public static boolean search(int[] arr, int value) {
        if (arr == null || arr.length == 0 || !CommonUtils.arrayInOrder(arr)) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void verify(SearchInterface searchMethod) {
        boolean isRight = true;
        int successNum = 0;
        for (int i = 0; i < CIRCULATE_TIMES; i++) {
            int[] arr = CommonUtils.randomArray(MAX_LENGTH, MAX_VALUE);
            int value = (int)Math.random()*MAX_VALUE;
            Arrays.sort(arr);
            boolean resultAct = searchMethod.search(arr, value);
            boolean resultExp = search(arr, value);

            if (resultAct != resultExp) {
                isRight = false;
                System.out.println("存在错误:");
                System.out.println("原数组为：" + Arrays.toString(arr));
                System.out.println("返回结果：" + resultAct);
                System.out.println("应为结果：" + resultExp);
                System.out.println("成功个数：" + successNum + "，总个数为：" + CIRCULATE_TIMES);
                break;
            }
            successNum++;
        }
        if (isRight) {
            System.out.println(searchMethod.getClass().getSimpleName() + "算法验证成功！");
        }
    }
}

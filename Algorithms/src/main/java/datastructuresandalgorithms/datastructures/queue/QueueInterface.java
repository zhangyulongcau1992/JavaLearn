package datastructuresandalgorithms.datastructures.queue;

/**
 * ClassName:QueueInterface
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.queue
 * Description:
 *
 * @Date:2022/2/13 10:44
 * @Author:zhangyulong@qq.com
 */
public interface QueueInterface <T> {
    /**
     * 在尾部添加
     */
    boolean offer(T value);

    /**
     * 删除并返回头部
     */
    T poll();

    /**
     * 获取头部但不删除
     */
    T peek();
}

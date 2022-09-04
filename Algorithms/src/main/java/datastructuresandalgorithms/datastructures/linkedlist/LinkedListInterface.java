package datastructuresandalgorithms.datastructures.linkedlist;

/**
 * ClassName:LinkedList
 * Package:com.zyl.learn.datastructuresandalgorithms.datastructures.linkedlist
 * Description:
 *
 * @Date:2022/2/12 15:45
 * @Author:zhangyulong@qq.com
 */
public interface LinkedListInterface<T> {
    void add(T value);
    void remove(int index);
    void remove(Object value);
    T get(int index);
    void reverse();
    int size();
}

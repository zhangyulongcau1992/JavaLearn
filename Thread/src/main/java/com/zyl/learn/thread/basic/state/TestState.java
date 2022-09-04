package com.zyl.learn.thread.basic.state;

import java.util.concurrent.locks.LockSupport;


/**
 * ClassName:TestState
 * Package:com.zyl.learn.thread.state
 * Description:
 *
 * @Date:2022/3/15 9:45
 * @Author:zhangyulong@qq.com
 */
public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread.State state;

        //1、初始状态 NEW
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        state = thread.getState();
        System.out.println(state);

        //2、就绪状态 RUNNABLE
        thread.start();
        state = thread.getState();
        System.out.println(state);

        //3、阻塞状态 TIMED_WAITING 和 就绪状态 RUNNABLE
        while ((state=thread.getState()) != Thread.State.TERMINATED) {
            System.out.println(state);
            Thread.sleep(200);
        }

        //4、死亡状态 TERMINATED
        System.out.println(state);
    }

    /*
    下面的枚举类State是在Thread类中定义的线程状态：
    NEW属于初始状态
    RUNNABLE属于就绪状态
    BLOCKED、WAITING、TIMED_WAITING都属于阻塞状态
    TERMINATED属于死亡状态
     */
    public enum State {
        /**
         * Thread state for a thread which has not yet started.
         */
        NEW,

        /**
         * Thread state for a runnable thread.  A thread in the runnable
         * state is executing in the Java virtual machine but it may
         * be waiting for other resources from the operating system
         * such as processor.
         */
        RUNNABLE,

        /**
         * Thread state for a thread blocked waiting for a monitor lock.
         * A thread in the blocked state is waiting for a monitor lock
         * to enter a synchronized block/method or
         * reenter a synchronized block/method after calling
         * {@link Object#wait() Object.wait}.
         */
        BLOCKED,

        /**
         * Thread state for a waiting thread.
         * A thread is in the waiting state due to calling one of the
         * following methods:
         * <ul>
         *   <li>{@link Object#wait() Object.wait} with no timeout</li>
         *   <li>{@link #join() Thread.join} with no timeout</li>
         *   <li>{@link LockSupport#park() LockSupport.park}</li>
         * </ul>
         *
         * <p>A thread in the waiting state is waiting for another thread to
         * perform a particular action.
         *
         * For example, a thread that has called {@code Object.wait()}
         * on an object is waiting for another thread to call
         * {@code Object.notify()} or {@code Object.notifyAll()} on
         * that object. A thread that has called {@code Thread.join()}
         * is waiting for a specified thread to terminate.
         */
        WAITING,

        /**
         * Thread state for a waiting thread with a specified waiting time.
         * A thread is in the timed waiting state due to calling one of
         * the following methods with a specified positive waiting time:
         * <ul>
         *   <li>{@link #sleep Thread.sleep}</li>
         *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
         *   <li>{@link #join(long) Thread.join} with timeout</li>
         *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
         *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
         * </ul>
         */
        TIMED_WAITING,

        /**
         * Thread state for a terminated thread.
         * The thread has completed execution.
         */
        TERMINATED;
    }
}

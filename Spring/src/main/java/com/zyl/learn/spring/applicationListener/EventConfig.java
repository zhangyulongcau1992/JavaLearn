package com.zyl.learn.spring.applicationListener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * ClassName:EventConfig
 * Package:com.zyl.learn.spring.applicationListener
 * Description:
 *
 * @Date:2023/4/3 8:33
 * @Author:zhangyulong@qq.com
 */
@Configuration
public class EventConfig {
    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.setTaskExecutor(Executors.newFixedThreadPool(5));
        return eventMulticaster;
    }
}

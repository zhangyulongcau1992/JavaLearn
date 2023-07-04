package com.zyl.learn.spring.applicationListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * ClassName:ApplicationEventService
 * Package:com.zyl.learn.spring.applicationListener.service
 * Description:
 *
 * @Date:2023/3/29 22:24
 * @Author:zhangyulong@qq.com
 */
@Service
@Slf4j
public class ApplicationEventService {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void marathon() {
        log.info("参加活动");
        log.info("发送邮件");
        EmailEvent emailEvent = new EmailEvent(this);
        emailEvent.setAddress("123@abc.com");
        emailEvent.setContent("活动开始啦");
        publisher.publishEvent(emailEvent);

    }
}

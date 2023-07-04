package com.zyl.learn.spring.applicationListener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ClassName:SendEmailListener
 * Package:com.zyl.learn.spring.applicationListener
 * Description:
 *
 * @Date:2023/4/3 8:22
 * @Author:zhangyulong@qq.com
 */
@Component
@Slf4j
public class SendEmailListener implements ApplicationListener<EmailEvent> {
    @Override
    public void onApplicationEvent(EmailEvent event) {
        log.info("Send email to " + event.getAddress());
        log.info("Email content is :" + event.getContent());
    }
}

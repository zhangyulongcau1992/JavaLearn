package com.zyl.learn.spring.applicationListener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

import java.io.Serial;
import java.time.Clock;

/**
 * ClassName:EmailEvent
 * Package:com.zyl.learn.spring.applicationListener
 * Description:
 *
 * @Date:2023/4/3 8:11
 * @Author:zhangyulong@qq.com
 */
@Getter
@Setter
@ToString
public class EmailEvent extends ApplicationEvent {
    @Serial
    private static final long serialVersionUID = 4533694798927378832L;
    private String address;
    private String content;

    public EmailEvent(Object source) {
        super(source);
    }
}

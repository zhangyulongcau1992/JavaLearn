package com.zyl.learn.spring.controller;

import com.zyl.learn.spring.applicationListener.ApplicationEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:StudyController
 * Package:com.zyl.learn.spring.applicationListener.controller
 * Description:
 *
 * @Date:2023/3/29 22:16
 * @Author:zhangyulong@qq.com
 */
@RestController("study")
@Slf4j
public class StudyController {
    @Autowired
    private ApplicationEventService eventService;

    @GetMapping("event/marathon")
    public void applicationEventMarathon() {
        eventService.marathon();
    }

}

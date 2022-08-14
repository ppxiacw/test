package com.example.test.controller;

import com.example.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：caowei
 * @version ：V
 * @program ：vevor-sem
 * @date ：Created in 2022/8/7
 * @description ：
 */
@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value = "/p1")
    public int p1(){
        int count = testService.count();
        return count;
    }

    @GetMapping(value = "/p2")
    public int p2(){
        int count = testService.count2();
        return count;
    }
}

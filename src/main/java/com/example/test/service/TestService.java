package com.example.test.service;

import com.example.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author ：caowei
 * @version ：V
 * @program ：vevor-sem
 * @date ：Created in 2022/8/7
 * @description ：
 */
@Service
@RequiredArgsConstructor
public class TestService {
    final private TestMapper testMapper;
    public int count() {

        return testMapper.count();
    }

    public int count2() {
        return testMapper.count2();
    }
}

package com.example.test.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ：caowei
 * @version ：V
 * @program ：vevor-sem
 * @date ：Created in 2022/8/7
 * @description ：
 */
@Mapper
public interface  TestMapper {
     int count() ;
     @DS("slave_1")
     int count2();
}

package com.example.sb22.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sb22.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @Author Jarvan
 * @create 2020/8/7 14:09
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}

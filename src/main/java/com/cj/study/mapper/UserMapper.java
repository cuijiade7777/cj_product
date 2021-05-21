package com.cj.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cj.study.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/20 2:53 下午
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}

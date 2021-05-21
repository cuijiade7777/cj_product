package com.cj.study.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (一句话描述该类的功能)
 *
 * @version v1.0
 * @Author: cuijia
 * @Date: 2021/5/20 2:50 下午
 */
@Data
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String name;

    private Integer age;

    private String email;
}

package com.yue.testwebservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: zhangyue
 * @date: 2019/1/3 10:47
 * @description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private String userId;
    private String username;
    private String age;
    private Date updateTime;

}

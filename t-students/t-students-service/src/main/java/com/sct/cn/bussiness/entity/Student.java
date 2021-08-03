package com.sct.cn.bussiness.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("STUDENT")
public class Student {

    /**
     * 学生id
     */
    @TableId
    private Integer id;

    /**
     * 学生名称
     */
    private String name;

    /**
     * 学生性别
     */
    private String gender;

    /**
     * 学生年龄
     */
    private Integer age;

    /**
     * 年级
     */
    private  String grade;


    /**
     * 教师id
     */
    private Integer headmasterId;
}

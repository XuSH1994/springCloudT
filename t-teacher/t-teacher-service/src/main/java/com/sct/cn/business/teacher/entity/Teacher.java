package com.sct.cn.business.teacher.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 教师entity
 */
@Data
@TableName("teacher")
public class Teacher{

    /**
     * 教师id
     */
    @TableId
    private Integer id;

    /**
     * 教师名称
     */
    private String name;

    /**
     * 教师性别
     */
    private String gender;

    /**
     * 教师年龄
     */
    private Integer age;

    /**
     * 教学科目
     */
    private String teachingSubjects;

    /**
     * 年级
     */
    private  String grade;

    /**
     * 是否是班主任(0：不是，1：是)
     */
    private Integer headmaster;

    /**
     * 所在教室
     */
    private Integer classroom;

    /**
     * 是否退休
     */
    @TableField(exist = false)  // 表明不是数据库字段
    private Integer status;
}

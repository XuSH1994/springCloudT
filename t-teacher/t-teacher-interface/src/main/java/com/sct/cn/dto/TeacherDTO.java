package com.sct.cn.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 教师entity
 */
@ApiModel("教师入参")
@Data
public class TeacherDTO implements Serializable {

    private static final long serialVersionUID = 3174898666629330864L;
    /**
     * 教师id
     */
    @ApiModelProperty("教师id")
    private Integer id;

    /**
     * 教师名称
     */
    @ApiModelProperty("教师名称")
    private String name;

    /**
     * 教师性别
     */
    @ApiModelProperty("教师性别")
    private String gender;

    /**
     * 教师年龄
     */
    @ApiModelProperty("教师年龄")
    private Integer age;

    /**
     * 教学科目
     */
    @ApiModelProperty("教学科目")
    private String teachingSubjects;

    /**
     * 年级
     */
    @ApiModelProperty("年级")
    private  String grade;

    /**
     * 是否是班主任(0：不是，1：是)
     */
    @ApiModelProperty("是否是班主任(0：不是，1：是)")
    private Integer headmaster;

    /**
     * 所在教室
     */
    @ApiModelProperty("所在教室")
    private Integer classroom;

    /**
     * 是否退休
     */
    @ApiModelProperty("是否退休")
    private Integer status;
}

package com.sct.cn.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "老师入参")
public class TeacherDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 教师id
     */
    @ApiModelProperty("主键")
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

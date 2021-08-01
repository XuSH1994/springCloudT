package com.sct.cn.business.teacher.controller;

import com.sct.cn.business.teacher.entity.Teacher;
import com.sct.cn.business.teacher.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Teacher前端控制器
 */
@RestController
@RequestMapping("/teacher")
@Api(value = "教师",tags = "教师")
@Validated  //参数校验
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getTeacherById/{id}")
    @ApiOperation("获取教师信息")
    public Teacher getTeacherById(@PathVariable("id") String id){
        return teacherService.findTeacher(id);
    }
}

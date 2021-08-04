package com.sct.cn.business.teacher.controller;

import com.sct.cn.business.teacher.entity.Teacher;
import com.sct.cn.business.teacher.service.TeacherService;
import com.sct.cn.dto.TeacherDTO;
import com.sct.cn.vo.TeacherVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Teacher前端控制器
 */
@RestController
@RequestMapping("/teacherController")
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

    @RequestMapping("/getTecaherFeign")
    @ApiIgnore
    public Teacher getTecaherFeign(String id){
        return teacherService.findTeacher(id);
    }

    @PostMapping("/postTeacher")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "教师id",paramType = "qurey",required = true),
            @ApiImplicitParam(name = "name",value = "教师名称",paramType = "qurey",required = true)
    })
    public TeacherVO postTeacher(TeacherDTO teacher){
        return teacherService.selectTeacher(teacher);
    }


}

package com.sct.cn.bussiness.controller;

import com.sct.cn.bussiness.service.StudentService;
import com.sct.cn.vo.TeacherVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentController")
@Api(value = "学生",tags = "学生")
@Validated
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/findNameById/{studentId}")
    public String findNameById(@PathVariable("studentId") String id ){
        return "";
    }

    @PostMapping("/findTeacherByStudentName")
    @ApiImplicitParams(
            @ApiImplicitParam(value = "name",name = "学生名称",paramType = "query",required = true)
    )
    public TeacherVO findTeacherByStudentName(String name){
        return studentService.findTeacherByStudentName(name);
    }
}

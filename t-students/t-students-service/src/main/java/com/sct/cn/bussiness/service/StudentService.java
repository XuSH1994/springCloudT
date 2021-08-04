package com.sct.cn.bussiness.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sct.cn.bussiness.entity.Student;
import com.sct.cn.vo.TeacherVO;

public interface StudentService extends IService<Student> {

    TeacherVO findTeacherByStudentName(String name);
}

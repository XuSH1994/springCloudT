package com.sct.cn.bussiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sct.cn.bussiness.entity.Student;
import com.sct.cn.bussiness.service.StudentService;
import com.sct.cn.dto.TeacherDTO;
import com.sct.cn.feign.TeacherInterfaceService;
import com.sct.cn.mapper.StudentMapper;
import com.sct.cn.vo.TeacherVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
@RefreshScope   //实现配置、实例热加载
public class StudentImplService extends ServiceImpl<StudentMapper,Student>  implements StudentService {

    @Autowired
    private TeacherInterfaceService teacherInterfaceService;

    @Override
    public TeacherVO findTeacherByStudentName(String name) {
        Integer teacherId = baseMapper.selectHeadmasterIdByName(name);
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacherId);
        return teacherInterfaceService.postTeacher(teacherDTO);
    }
}

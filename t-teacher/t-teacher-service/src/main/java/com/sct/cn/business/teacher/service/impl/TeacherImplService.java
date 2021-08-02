package com.sct.cn.business.teacher.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sct.cn.business.teacher.entity.Teacher;
import com.sct.cn.business.teacher.service.TeacherService;
import com.sct.cn.mapper.TeacherMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
@RefreshScope   //实现配置、实例热加载
public class TeacherImplService extends ServiceImpl<TeacherMapper, Teacher>  implements TeacherService {
    @Override
    public Page<Teacher> teacherExhibition(Page page) {
        return null;
    }

    @Override
    public Teacher findTeacher(String id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Teacher selectTeacher(Teacher teacher) {
        return baseMapper.selectTeacherByName(teacher.getName());
    }
}

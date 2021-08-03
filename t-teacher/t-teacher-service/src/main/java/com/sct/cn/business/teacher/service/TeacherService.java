package com.sct.cn.business.teacher.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sct.cn.business.teacher.entity.Teacher;
import com.sct.cn.dto.TeacherDTO;
import com.sct.cn.vo.TeacherVO;

/**
 * Teacher服务类
 */
public interface TeacherService extends IService<Teacher> {

    /**
     * 分页展示
     * @param page
     * @return
     */
    Page<Teacher> teacherExhibition(Page page);

    /**
     * 根据id查询老师
     * @param id
     * @return
     */
    Teacher findTeacher(String id);



    TeacherVO selectTeacher(TeacherDTO teacher);
}

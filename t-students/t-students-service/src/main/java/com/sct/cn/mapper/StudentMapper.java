package com.sct.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sct.cn.bussiness.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {

    Integer selectHeadmasterIdByName(String name);
}

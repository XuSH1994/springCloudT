package com.sct.cn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sct.cn.business.teacher.entity.Teacher;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Repository;

/**
 * Teacher接口
 */
@Repository //需要在Spring中配置扫描包地址，然后生成dao层的bean，之后被注入到ServiceImpl中
//@Mapper   //不需要在spring配置中设置扫描地址，通过mapper.xml里面的namespace属性对应相关的mapper类，spring将动态的生成Bean后注入到ServiceImpl中
public interface TeacherMapper extends BaseMapper<Teacher> {

    /**
     * 根据id查询
     * @param id
     * @return
     */
//    Teacher selectById(Integer id);

    Teacher selectTeacherByName(String name);
}

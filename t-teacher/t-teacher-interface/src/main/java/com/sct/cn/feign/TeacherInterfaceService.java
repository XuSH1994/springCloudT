package com.sct.cn.feign;

import com.sct.cn.dto.TeacherDTO;
import com.sct.cn.vo.TeacherVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("TEACHER-DEV")
public interface TeacherInterfaceService {

    @PostMapping("/postTeacher")
    TeacherVO postTeacher(TeacherDTO teacher);
}

package com.sct.cn.feign;

import com.sct.cn.dto.TeacherDTO;
import com.sct.cn.vo.TeacherVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(value = "teacher")
@FeignClient(name = "teacher",url = "localhost:7001/teacher")
public interface TeacherInterfaceService {

    @PostMapping("/teacherController/postTeacher")
    TeacherVO postTeacher(@SpringQueryMap TeacherDTO teacher);
}

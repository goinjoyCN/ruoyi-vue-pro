package cn.iocoder.yudao.module.study.controller.app.course;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "学习APP - 课程")
@RestController
@RequestMapping("/study/course")
@Validated
@Slf4j
public class AppStudyCourseController {

    @GetMapping("/get")
    public boolean getCourseInfo() {
        return false;
    }

    @GetMapping("/list")
    public boolean getCourseList() {
        return false;
    }
}

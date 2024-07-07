package cn.iocoder.yudao.module.study.controller.app.question;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "学习APP - 问题")
@RestController
@RequestMapping("/study/question")
@Validated
@Slf4j
public class AppStudyQuestionController {
}

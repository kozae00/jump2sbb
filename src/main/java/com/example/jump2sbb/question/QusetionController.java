package com.example.jump2sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QusetionController {

    private final QuestionService questionService;

    @GetMapping("/question/list")
    public String list(Model model) {

        List<Question> questionList = this.questionService.getList();

        model.addAttribute("quetionList", questionList);

        return "question_list";
    }
}

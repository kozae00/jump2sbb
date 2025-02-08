package com.example.jump2sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping(value = "/question/list/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        return "question_detail";
    }
}

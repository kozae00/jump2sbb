package com.example.jump2sbb.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QusetionController {

    @GetMapping("/question/list")
    public String list() {
        return "question_list";
    }
}

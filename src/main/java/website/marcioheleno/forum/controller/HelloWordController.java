package website.marcioheleno.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloWordController {

    @GetMapping
    @ResponseBody
    public String HelloWord() {
        return "Hello World";
    }
}

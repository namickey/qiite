package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistController {

    @RequestMapping(value = "/regist/index")
    public String index(){
        return "input";
    }

    @RequestMapping(value = "/regist/check")
    public String check(){
        return "confirm";
    }

    @RequestMapping(value = "/regist/confirm")
    public String confirm(){
        return "redirect:complete";
    }

    @RequestMapping(value = "/regist/complete")
    public String complete(){
        return "complete";
    }
}

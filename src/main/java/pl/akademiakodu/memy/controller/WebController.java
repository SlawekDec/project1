package pl.akademiakodu.memy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Sławek on 01.08.2017.
 */
@Controller
public class WebController {




    @GetMapping("/hello") // wywołuje show
    public String add(){
        return "hello";
    }
}

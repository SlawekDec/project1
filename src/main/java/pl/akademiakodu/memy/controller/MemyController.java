package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Sławek on 02.08.2017.
 */
@Controller
public class MemyController {

    @GetMapping("/")
    public String add(ModelMap modelMap){
        return "/home";
    }
}

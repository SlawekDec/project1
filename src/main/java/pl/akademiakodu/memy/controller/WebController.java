package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Qbala on 2017-08-01.
 */

@Controller
public class WebController {


    @GetMapping("/hello") // wywołuje show

    public String add(){
        return "hello";
    }
}

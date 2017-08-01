package pl.akademiakodu.memy.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Sławek on 01.08.2017.
 */
public class WebController {


    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}

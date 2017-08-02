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
    public String add(ModelMap modelMap) {
        return "/home";
    }


//
//    @GetMapping("/1")
//    public String add1(ModelMap modelMap){
//        return "/gif.details";
//    }
//
//    @GetMapping("/2")
//    public String add2(ModelMap modelMap){
//        return "/favorites";
//    }
//
//
//    @GetMapping("/3")
//    public String add4(ModelMap modelMap){
//        return "/category";
//    }
//
//    @GetMapping("/4")
//    public String add5(ModelMap modelMap){
//        return "/categories";
//    }



}

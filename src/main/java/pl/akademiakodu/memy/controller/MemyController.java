package pl.akademiakodu.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.memy.dao.MemDaoImpl;
import pl.akademiakodu.memy.model.Mem;

/**
 * Created by Sławek on 02.08.2017.
 */
@Controller
public class MemyController {



    @GetMapping("/")
    public String all(ModelMap modelMap) {

        MemDaoImpl memDao = new MemDaoImpl();
        modelMap.addAttribute("gifs", memDao.showAll());
        System.out.println(memDao.showAll());

        return "home";
    }

    @GetMapping("/favorites")
    public String all1(ModelMap modelMap) {

        MemDaoImpl memDao = new MemDaoImpl();
        modelMap.addAttribute("gifs", memDao.showFavourite());
        return "/favorites";

    }

    @GetMapping("/gifs/search")  // wywołuje person/results
    public String search(@RequestParam String q) {
        System.out.println("Test" + q);
        return "home";
    }





//    @PostMapping("/results")
//    public String results(@ModelAttribute Mem mem, ModelMap modelMap) {
//        System.out.println("eeeeeeeeeee");
//
//        String name = mem.getName();
//        MemDaoImpl memDao = new MemDaoImpl();
//        modelMap.addAttribute("gif", memDao.searchName(name));
//
//        return "hello";
//    }








//    @GetMapping("/{gif/{name}") // zmianna id
//    public String display(@PathVariable String name, ModelMap modelMap, @ModelAttribute Mem mem, ModelMap
//            modelMap1){
//        System.out.println("Moje name to " + name);
//
//        MemDaoImpl memDao = new MemDaoImpl();
//        modelMap.addAttribute("gif", memDao.findName(name));
//
//        return "gif-details";
//
//    }


    @GetMapping("/2")
    public String add2(ModelMap modelMap){
        return "/favorites";
    }


}

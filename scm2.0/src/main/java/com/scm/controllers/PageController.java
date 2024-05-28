package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Handler");

        // Add Dynamic value in form of Key & Values
        model.addAttribute("name", "Samskara Soyabean Exporter");
        model.addAttribute("YoutubeChannel", "Exporter of Soyabean from India");
        model.addAttribute("GithubRepository", "https://github.com/patel812/scm2.0/commits/master/");

        return "home";
    }

}

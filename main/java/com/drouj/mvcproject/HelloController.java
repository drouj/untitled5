package com.drouj.mvcproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        log.info("Hello comes!");
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getParam(ModelMap model) {
//        model
        return "POST ce was";
    }
}
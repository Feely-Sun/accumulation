package com.work.acc.app.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunzihan
 * @version $Id: IndexController.java V 0.1 11/29/16 20:53 sunzihan EXP $
 */


@RestController
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String index(ModelMap modelMap){
        return "Hello World";
    }
}


package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping("/spsample") 
    public ModelAndView page(ModelAndView mav) {
        mav.setViewName("sample"); 
        return mav;
    }
}

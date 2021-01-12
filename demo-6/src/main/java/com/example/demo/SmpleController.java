package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SmpleController {
	@RequestMapping("/hello") // アクセス先URIに関連する
    public ModelAndView page(ModelAndView mav) {
        mav.setViewName("hello"); // HTMLファイル名を拡張子無しで指定する
        return mav;
	}

}

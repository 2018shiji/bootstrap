package com.example.demo.bootstrap.controller;

import com.example.demo.bootstrap.model.Article;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by DGM on 2019/10/24.
 */
@Controller
public class SiteController {

    @RequestMapping("/")
    public String index(Model model){
        ArrayList<Article> list = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            list.add(new Article("Async：简洁优雅的异步之道", "异步处理方案中", "www.baidu.com"));
            list.add(new Article("H5 前端性能测试实践", "H5 页面发版灵活", "www.baidu.com"));
            list.add(new Article("学习Python的建议", "编程语言。", "www.baidu.com"));
        }
        model.addAttribute("articleList", list);
        return "index";
    }

    @RequestMapping("/ajaxredirect")
    public String redirect(String webUrl, String webTitle){
        System.out.println(webUrl + "   :    " + webTitle);
        return "ajaxredirect";
    }

    @RequestMapping("/index")
    @ResponseBody
    public Article toIndex(){
        return new Article("1", "1", "1");
    }

    @RequestMapping("/ajax1")
    public String direct(Model model){
        ArrayList<Article> list = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            list.add(new Article("Async：简洁优雅的异步之道", "异步处理方案中", "www.baidu.com"));
            list.add(new Article("H5 前端性能测试实践", "H5 页面发版灵活", "www.baidu.com"));
            list.add(new Article("学习Python的建议", "编程语言。", "www.baidu.com"));
        }
        model.addAttribute("articleList", list);
        return "ajax1";
    }

    @RequestMapping("/ajax2")
    public String ajax2(Model model){
        return "ajax2";
    }

}

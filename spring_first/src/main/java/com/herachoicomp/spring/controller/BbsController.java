package com.herachoicomp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.herachoicomp.spring.service.BbsService;
import com.herachoicomp.spring.vo.Article;

@Controller
@RequestMapping("/bbs")
public class BbsController {

	@Autowired
	private BbsService bbsService;
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write1() {
		bbsService.registArticle(new Article());
		System.out.println("post request");
		return "write_ok";
	}
	
	@RequestMapping("/write")
	public String write2(@RequestParam("author") String author) {
		bbsService.registArticle(new Article());
		System.out.println("get request");
		return "write_ok";
	}	
}

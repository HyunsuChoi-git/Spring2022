package com.herachoicomp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.herachoicomp.spring.service.BbsService;
import com.herachoicomp.spring.vo.Article;

@Controller
@RequestMapping("/bbs")
public class BbsController {

	@Autowired
	private BbsService bbsService;
	
	@GetMapping("/{articleId}")
	@ResponseBody     //리턴 내용을  Json형태로 리턴해준다.
	public Article viewDetail(@PathVariable String articleId) { 
	//spring에서 json형태로 reponse할 때는 json타입이 아닌 객체 자체를 Return해버림. 
		Article article = this.bbsService.viewArticleDetail(articleId);
		
		return article;
	}
	
	@PostMapping("/write")
	@ResponseBody  //리턴 내용을  Json형태로 리턴해준다.
	public Article write(@RequestBody Article article) {
		//요청을 JSON타입으로 받는다.
		
		return article;
	}
	
//	@PostMapping("/writepost")
//	public ModelAndView writepost(Article article) {  
//		//파라미터에 특정클래스의 객체가 오면 Command객체로 인식
//		//해당 클래스와 property(멤버변수)를 비교하여 이름이 같으면 정상적으로 객체로 받음
//		bbsService.registArticle(article);
//		System.out.println("post request");
//		
//		return new ModelAndView("write_ok").addObject("article", article);
//	}
	
/*	public String writepost(Article article) {  
		//파라미터에 특정클래스의 객체가 오면 Command객체로 인식
		//해당 클래스와 property(멤버변수)를 비교하여 이름이 같으면 정상적으로 객체로 받음
		bbsService.registArticle(article);
		System.out.println("post request");
		return "write_ok";
	}	*/	
	
//	@GetMapping("/{articleId}")
//	public String viewDetail(@PathVariable String articleId) {
//		System.out.println("글번호는 : "+articleId);
//		
//		return "write_ok";
//	}
//	
//	
//	@RequestMapping(value="/write", method=RequestMethod.POST)
//	public String write1() {
//		bbsService.registArticle(new Article());
//		System.out.println("post request");
//		return "write_ok";
//	}
//	
//	@RequestMapping("/write")
//	public String write2(@RequestParam("author") String author) {
//		bbsService.registArticle(new Article());
//		System.out.println("get request");
//		return "write_ok";
//	}	
	
	
}

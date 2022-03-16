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
	@ResponseBody     //���� ������  Json���·� �������ش�.
	public Article viewDetail(@PathVariable String articleId) { 
	//spring���� json���·� reponse�� ���� jsonŸ���� �ƴ� ��ü ��ü�� Return�ع���. 
		Article article = this.bbsService.viewArticleDetail(articleId);
		
		return article;
	}
	
	@PostMapping("/write")
	@ResponseBody  //���� ������  Json���·� �������ش�.
	public Article write(@RequestBody Article article) {
		//��û�� JSONŸ������ �޴´�.
		
		return article;
	}
	
//	@PostMapping("/writepost")
//	public ModelAndView writepost(Article article) {  
//		//�Ķ���Ϳ� Ư��Ŭ������ ��ü�� ���� Command��ü�� �ν�
//		//�ش� Ŭ������ property(�������)�� ���Ͽ� �̸��� ������ ���������� ��ü�� ����
//		bbsService.registArticle(article);
//		System.out.println("post request");
//		
//		return new ModelAndView("write_ok").addObject("article", article);
//	}
	
/*	public String writepost(Article article) {  
		//�Ķ���Ϳ� Ư��Ŭ������ ��ü�� ���� Command��ü�� �ν�
		//�ش� Ŭ������ property(�������)�� ���Ͽ� �̸��� ������ ���������� ��ü�� ����
		bbsService.registArticle(article);
		System.out.println("post request");
		return "write_ok";
	}	*/	
	
//	@GetMapping("/{articleId}")
//	public String viewDetail(@PathVariable String articleId) {
//		System.out.println("�۹�ȣ�� : "+articleId);
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

package com.herachoicomp.spring.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/bbs")
public class FileUploadController {
	
	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file,
			@RequestParam("name") String filename, Model model) throws IllegalStateException, IOException {
		// 파라미터로 파일과, 파일명, 데이터 바인딩을 위한 Model객체
		
		
		//파일 저장
		if(!file.isEmpty()) {
			File f = new File("c:\\upload", file.getOriginalFilename());
			//저장을 위한 파일 객체 생성
			file.transferTo(f);
		}
		
		//Model 객체를 이용하여 객체 전달
		model.addAttribute("filename", filename);
		
		return "upload_ok";
	}

}

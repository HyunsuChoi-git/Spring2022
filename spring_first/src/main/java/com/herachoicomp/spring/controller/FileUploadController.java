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
		// �Ķ���ͷ� ���ϰ�, ���ϸ�, ������ ���ε��� ���� Model��ü
		
		
		//���� ����
		if(!file.isEmpty()) {
			File f = new File("c:\\upload", file.getOriginalFilename());
			//������ ���� ���� ��ü ����
			file.transferTo(f);
		}
		
		//Model ��ü�� �̿��Ͽ� ��ü ����
		model.addAttribute("filename", filename);
		
		return "upload_ok";
	}

}

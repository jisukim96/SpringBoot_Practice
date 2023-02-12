package com.mysite.practice.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysite.practice.Users1Repository;
import com.mysite.practice.users1.Users1;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class Users1Controller {
	
	
	private final Users1Repository users1Repository;
	
	@GetMapping("/getpage")
	public String pageOn() {
		
		return "openpage";
	}
	
	@GetMapping("/save")
	public void saveAtH2(){
		
		Users1 users1_dto = new Users1();
		users1_dto.setName("홍길동");
		users1_dto.setRegDate(LocalDateTime.now());
		users1_dto.setEmail("이메일 입력");
		
		this.users1Repository.save(users1_dto);
		
		
	}
	
	
	
}

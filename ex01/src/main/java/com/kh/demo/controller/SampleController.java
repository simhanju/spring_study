package com.kh.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.demo.dto.SampleDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
//	@GetMapping("")
//	public String empty() {
//		System.out.println("======== ========");
//		return "a";
//	}
	
	@RequestMapping("basic")
	public void gkgkgk() {
		System.out.println("======== basic =======");
	}
	
	@GetMapping("basic1")
	public void basicGet(int age) {
		System.out.println("========Get 방식으로 요청=======");
		System.out.println("age : "+age);
	}
	
	@PostMapping("basic1")
	public void basicPost(int age) {
		System.out.println("=======Post 방식으로 요청=======");
		System.out.println("age : "+age);
	}
	
	@RequestMapping(value="basic2", method = {RequestMethod.GET, RequestMethod.POST})
	public void basic2() {
		System.out.println("==============GET, POST 방식으로 요청=============");
	}
	
	//DTO 객체로 수집하기
	@GetMapping("test01")
	public void test01(SampleDTO dto) {
		System.out.println(dto);
	}
	
	//파라미터 명과 담을 변수명이 다른 경우 수집방법(특정 이름의 파라미터로 날아오는 데이터 수집 방법)
	//localhost:8080/sample/test02?data1=김사과&data2=10
	@GetMapping("test02")
	public void test02(@RequestParam("data1") String name, @RequestParam("data2") int age) {
		System.out.println(name+" / "+age);
	}
	
	//파라미터가 같은 이름으로 여러개 날아오는 경우 수집 방법
	//localhost:8080/sample/test03?data=10&data=20
	@GetMapping("test03")
	public void test03(@RequestParam("data") String[] datas, Model model) {
		model.addAttribute("datas", datas);
	}
	
	
	@GetMapping("test04")
	public void test04(@RequestParam("data") ArrayList<Integer> datas, Model model) {
		model.addAttribute("datas", datas);
	}
	
	@GetMapping("test05")
	public void test05() {
		String str = null;
		str.charAt(10);
	}
}

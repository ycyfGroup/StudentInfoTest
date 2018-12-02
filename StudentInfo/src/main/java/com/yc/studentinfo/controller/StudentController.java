package com.yc.studentinfo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.studentinfo.service.StudentService;

@Controller
public class StudentController {
	@Resource
	StudentService stu;
	
	@RequestMapping("/a")
	public String post(){
		return "delete";
	}
	
	@DeleteMapping("/delete/{id}")
	public void del(@PathVariable("id") Integer id){
		System.out.println("ss");
		stu.del(id);
	}

}

package com.yc.studentinfo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.studentinfo.beans.Student;
import com.yc.studentinfo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 查询学生信息
	 */
	@GetMapping("/all")
	public String selectAll(HttpSession session) {
		List<Student> studentList = studentService.selectAll();
		session.setAttribute("studentList", studentList);
		return "index";
	}
}

package com.yc.studentinfo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.yc.studentinfo.beans.Student;
import com.yc.studentinfo.service.StudentService;

/**
 * 
 * Title: StudentController  
 * Description:   
 * @author Zhu YuJia
 * @date 2018年12月2日
 */
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
	/**
	 * 
	 * Title: addUser  
	 * Description:   添加学生信息
	 * @param student
	 * @param sname
	 * @param model
	 * @return
	 */
	@PostMapping(value="/addStudent")
	public String addUser(Student student,Model model) {
		
		
		studentService.addStudent(student);
		 model.addAttribute("studentList", studentService.selectAll()) ;
		 return "index";
	}
	
}

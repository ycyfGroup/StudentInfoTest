package com.yc.studentinfo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.studentinfo.beans.Student;
import com.yc.studentinfo.service.StudentService;
import com.yc.studentinfo.utils.JsonModel;

/**
 * 
 * @author 偶是智障儿童
 *
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

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public JsonModel del(JsonModel jsonModel, Student student) {
		Integer del = studentService.del(student.getId());
		System.err.println(del);
		if (del > 0) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
			jsonModel.setErrorMsg("删除失败");
		}
		return jsonModel;
	}
}

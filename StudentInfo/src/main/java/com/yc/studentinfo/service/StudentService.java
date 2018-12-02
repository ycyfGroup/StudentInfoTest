package com.yc.studentinfo.service;

import java.util.List;

import com.yc.studentinfo.beans.Student;

/**
 * 
 * Title: StudentService  
 * Description:   
 * @author Zhu YuJia
 * @date 2018年12月2日
 */
public interface StudentService {
	/**
	 * 查询所有的用户信息
	 * 
	 * @return
	 */
	public List<Student> selectAll();


	/**
	 * 
	 * Title: StudentService
	 * 
	 * @author liumin
	 * @date 2018年12月2日
	 *
	 *       Description:根据用户id删除一条记录
	 * @param id
	 */
	public Integer del(Integer id);

	
	/**
	 * 添加学生信息
	 * Title: addStudent  
	 * Description:
	 */
	public void addStudent(Student student);
}

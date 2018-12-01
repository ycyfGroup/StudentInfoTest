package com.yc.studentinfo.service;

import java.util.List;

import com.yc.studentinfo.beans.Student;

/**
 * student业务层处理
 * 
 * @author 偶是智障儿童
 *
 */
public interface StudentService {
	/**
	 * 	查询所有的用户信息
	 * 
	 * @return
	 */
	public List<Student> selectAll();
}

package com.yc.studentinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yc.studentinfo.beans.Student;
import com.yc.studentinfo.dao.BaseDao;
import com.yc.studentinfo.service.StudentService;

@Repository
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private BaseDao<Student> baseDao;
	
	@Override
	public List<Student> selectAll() {
		return baseDao.findAll(Student.class, "selectAll");
	}

}

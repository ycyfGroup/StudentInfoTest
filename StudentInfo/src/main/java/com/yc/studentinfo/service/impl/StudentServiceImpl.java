package com.yc.studentinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yc.studentinfo.beans.Student;
import com.yc.studentinfo.dao.BaseDao;
import com.yc.studentinfo.service.StudentService;

@Repository
public class StudentServiceImpl implements StudentService {
	@Autowired
	BaseDao db;

	@Override
	public void del(Integer id) {
		db.del(Student.class, "deleteStudentInfo",id);		
	}

}

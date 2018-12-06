package com.yc.studentinfo.beans;

import java.io.Serializable;

import lombok.Data;

/**
 * student表（id 编号   sname 姓名）
 * @author 偶是智障儿童
 *
 */
@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5585711513388423850L;
	
	//学生编号
	private Integer id;
	
	//学生姓名
	private String sname;
	
	//获取学生编号
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	
	

}

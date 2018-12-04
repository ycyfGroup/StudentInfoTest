package com.yc.studentinfo.beans;

import java.io.Serializable;

/**
 * student表（id 编号   sname 姓名）
 * @author 陈杰
 *
 */
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5585711513388423850L;
	
	/**
	 * 学生编号
	 */
	private Integer id;
	
	/**
	 *  id 学生姓名
	 */
	private String sname;
	
	/**
	 * 获取学生编号
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 设置学生编号
	 * @param id 学生编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取学生姓名
	 * @return sname 学生姓名
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * 设置学生姓名
	 * @param sname  学生姓名
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	
	

}

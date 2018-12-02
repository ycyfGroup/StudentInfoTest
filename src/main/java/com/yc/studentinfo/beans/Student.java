package com.yc.studentinfo.beans;

import java.io.Serializable;

/**
 * 
* Title: Student  
* Description:   
* @author Zhu YuJia
* @date 2018年12月2日
 */
public class Student implements Serializable {

	
	private static final long serialVersionUID = -5585711513388423850L;
	
	
	/**
	 * 学生编号
	 */
	private Integer id;
	
	
	/**
	 * 学生姓名
	 */
	private String sname;
	
	
	/**
	 * 
	 * Title: getId  
	 * Description:  获取学生编号 
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	

	/**
	 * 
	 * Title: setId  
	 * Description: 设置学生编号  
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	
	/**
	 * 
	 * Title: getSname  
	 * Description: 获取学生姓名  
	 * @return
	 */
	public String getSname() {
		return sname;
	}

	
	/**
	 * 
	 * Title: setSname  
	 * Description:设置学生姓名   
	 * @param sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	
	

}

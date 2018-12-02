package com.yc.studentinfo.utils;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 
 * @author 陈杰
 * @date 2018/12/02
 */
@Component
public class JsonModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9106902882602433353L;
	
	/**
	 * 返回状态  ： 1 成功  0失败
	 */
	private Integer code; 
	/**
	 *  obj 用来存放返回的数据
	 */
	private Object obj;
	/**
	 *  errorMsg 存放错误数据
	 */
	private String errorMsg;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@Override
	public String toString() {
		return "JsonModel [code=" + code + ", obj=" + obj + ", errorMsg=" + errorMsg + "]";
	}
	
}

package com.yc.studentinfo.utils;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Title: JsonModel  
 * Description:   
 * @author Zhu YuJia
 * @date 2018年12月2日
 */
@Component
public class JsonModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9106902882602433353L;
	
	private Integer code; 
	private Object obj;
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

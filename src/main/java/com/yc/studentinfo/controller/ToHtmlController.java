package com.yc.studentinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * Title: ToHtmlController  
 * Description:   
 * @author Zhu YuJia
 * @date 2018年12月2日
 */
@Controller
public class ToHtmlController {
	
	/**
	 * 
	 * Title: toIndex  
	 * Description:   跳转主界面
	 * @return
	 */
	@RequestMapping(value= {"/","","index"})
	public String toIndex() {
		return "index";
	}
	
	
}

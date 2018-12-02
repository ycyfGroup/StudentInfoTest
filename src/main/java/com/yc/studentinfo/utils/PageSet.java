package com.yc.studentinfo.utils;

import java.io.Serializable;
import java.util.List;

/**
* Title: PageSet  
* Description:   
* @author Zhu YuJia
* @date 2018年12月2日
 */
public class PageSet<T> implements Serializable{
	
	
	private static final long serialVersionUID = 1262565905521592031L;
	private Integer total;
	private Integer pages;
	private Integer pagesize;
	private Integer pageNum;
	private List<T> list;
	/**
	 * 
	 * Title: getPageNum  
	 * Description:   
	 * @return
	 */
	public Integer getPageNum() {
		return pageNum;
	}
	/**
	 * 
	 * Title: setPageNum  
	 * Description:   
	 * @param pageNum
	 */
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * 
	 * Title: getTotal  
	 * Description:   
	 * @return
	 */
	public Integer getTotal() {
		return total;
	}
	/**
	 * 
	 * Title: setTotal  
	 * Description:   
	 * @param total
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
	/**
	 * 
	 * Title: getPages  
	 * Description:   
	 * @return
	 */
	public Integer getPages() {
		return pages;
	}
	/**
	 * 
	 * Title: setPages  
	 * Description:   
	 * @param pages
	 */
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	/**
	 * 
	 * Title: getPagesize  
	 * Description:   
	 * @return
	 */
	public Integer getPagesize() {
		return pagesize;
	}
	/**
	 * 
	 * Title: setPagesize  
	 * Description:   
	 * @param pagesize
	 */
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	/**
	 * 
	 * Title: getList  
	 * Description:   
	 * @return
	 */
	public List<T> getList() {
		return list;
	}
	/**
	 * 
	 * Title: setList  
	 * Description:   
	 * @param list
	 */
	public void setList(List<T> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageSet [total=" + total + ", pages=" + pages + ", pagesize=" + pagesize + ", list=" + list + "]";
	}
	
 
}

package com.yc.studentinfo.dao;

import java.util.List;
import java.util.Map;

/**
 * dao层使用的包装类
 * 
 * @author 偶是智障儿童
 *
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 添加操作
	 * 
	 * @param t     类名
	 * @param sqlId 方法名
	 */
	public void save(T t, String sqlId);

	/**
	 * 添加操作
	 * 
	 * @param clazz 类
	 * @param sqlId 方法名
	 * @param map   存放数据的map集合
	 */
	public void save(Class<T> clazz, String sqlId, Map<String, Object> map);

	/**
	 * 添加操作
	 * 
	 * @param clazz 类
	 * @param sqlId 方法名
	 * @param list  存放数据的list集合
	 */
	public void save(Class<T> clazz, String sqlId, List<T> list);

	/**
	 * 更新数据操作
	 * 
	 * @param t
	 * @param sqlId
	 */
	public void update(T t, String sqlId);

	/**
	 * 更新数据操作
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param map
	 */
	public void update(Class<T> clazz, String sqlId, Map<String, Object> map);

	/**
	 * 更新数据操作
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param list
	 */
	public void update(Class<T> clazz, String sqlId, List<T> list);

	/**
	 * 更新数据操作
	 * 
	 * @param clazz
	 * @param sqlId
	 */
	public void update(Class<T> clazz, String sqlId);

	/**
	 * 删除操作
	 * 
	 * @param t
	 * @param sqlId
	 */
	public void del(T t, String sqlId);

	/**
	 * 删除操作
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param map
	 */
	public void del(Class<T> clazz, String sqlId, Map<String, Object> map);

	/**
	 * 删除操作
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param ids
	 */
	public void del(Class<T> clazz, String sqlId, List<Integer> ids);

	/**
	 * 删除操作
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param id
	 */
	public void del(Class<T> clazz, String sqlId, Integer id);

	/**
	 * 查询所有
	 * 
	 * @param t
	 * @param sqlId
	 * @return 
	 */
	public List<T> findAll(T t, String sqlId);

	/**
	 * 查询所有
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param map
	 * @return
	 */
	public List<T> findAll(Class<T> clazz, String sqlId, Map<String, Object> map);

	/**
	 * 查询所有
	 * 
	 * @param clazz
	 * @param sqlId
	 * @return
	 */
	public List<T> findAll(Class<T> clazz, String sqlId);

	/**
	 * 单条数据查询
	 * 
	 * @param t
	 * @param sqlId
	 * @return
	 */
	public T findOne(T t, String sqlId);

	/**
	 * 单条数据查询
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param map
	 * @return
	 */
	public T findOne(Class<T> clazz, String sqlId, Map<String, Object> map);

	/**
	 * 单条数据查询
	 * 
	 * @param clazz
	 * @param sqlId
	 * @return
	 */
	public T findOne(Class<T> clazz, String sqlId);

	/**
	 * 单条数据查询
	 * 
	 * @param clazz
	 * @param sqlId
	 * @param map
	 * @return
	 */
	public int findCount(Class<T> clazz, String sqlId, Map<String, Object> map);
}

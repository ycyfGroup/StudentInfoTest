package com.yc.studentinfo.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yc.studentinfo.dao.BaseDao;

/**
 * baseDao 的实现类
 * @author 偶是智障儿童
 *
 * @param <T>
 */
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

	private final String MAPPERPATH = "com.yc.studentinfo.mapper.";

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void save(T t, String sqlId) {
		sqlSession.insert(MAPPERPATH + t.getClass().getSimpleName() + "Mapper." + sqlId,t);
	}

	@Override
	public void save(Class<T> clazz, String sqlId, Map<String, Object> map) {
		sqlSession.insert(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);
	}

	@Override
	public void save(Class<T> clazz, String sqlId, List<T> list) {
		sqlSession.insert(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,list);
	}

	@Override
	public void update(T t, String sqlId) {
		sqlSession.update(MAPPERPATH + t.getClass().getSimpleName() + "Mapper." + sqlId,t);
	}

	@Override
	public void update(Class<T> clazz, String sqlId, Map<String, Object> map) {
		sqlSession.update(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);
	}

	@Override
	public void update(Class<T> clazz, String sqlId, List<T> list) {
		sqlSession.update(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,list);
	}

	@Override
	public void update(Class<T> clazz, String sqlId) {
		sqlSession.update(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId);
	}

	@Override
	public Integer del(T t, String sqlId) {
		return sqlSession.delete(MAPPERPATH + t.getClass().getSimpleName() + "Mapper." + sqlId,t);
	}

	@Override
	public Integer del(Class<T> clazz, String sqlId, Map<String, Object> map) {
		return sqlSession.delete(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);

	}

	@Override
	public Integer del(Class<T> clazz,String sqlId, List<Integer> ids) {
		return sqlSession.delete(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,ids);		
	}

	@Override
	public Integer del(Class<T> clazz, String sqlId,Integer id) {
		return sqlSession.update(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,id);
	}

	@Override
	public List<T> findAll(T t, String sqlId) {
		return sqlSession.selectList(MAPPERPATH + t.getClass().getSimpleName() + "Mapper." + sqlId,t);
	}

	@Override
	public List<T> findAll(Class<T> clazz, String sqlId, Map<String, Object> map) {
		return sqlSession.selectList(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);
	}

	@Override
	public List<T> findAll(Class<T> clazz, String sqlId) {
		return sqlSession.selectList(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId);
	}

	@Override
	public T findOne(T t, String sqlId) {
		List<T> list = sqlSession.selectList(MAPPERPATH + t.getClass().getSimpleName() + "Mapper." + sqlId,t);
		if(list != null && list.size()>0){
			return list.get(0);
		}else {
			return null;
		}
	}

	@Override
	public T findOne(Class<T> clazz, String sqlId, Map<String, Object> map) {
		List<T> list = sqlSession.selectList(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);
		if(list != null && list.size()>0){
			return list.get(0);
		}else {
			return null;
		}

	}

	@Override
	public T findOne(Class<T> clazz, String sqlId) {
		 List<T> list = sqlSession.selectList(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId);
		 if(list != null && list.size()>0){
				return list.get(0);
			}else {
				return null;
			}

	}

	@Override
	public int findCount(Class<T> clazz, String sqlId, Map<String, Object> map) {
		return sqlSession.selectOne(MAPPERPATH + clazz.getSimpleName() + "Mapper." + sqlId,map);
	}

}

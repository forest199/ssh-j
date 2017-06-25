package com.forest.dandan.repos.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

public class BaseRepoImpl<T,ID extends Serializable>{
	
	private Logger log = Logger.getLogger(getClass());
	
	@PersistenceContext
	protected EntityManager manager;
	
	@SuppressWarnings("rawtypes")
	private Class clazz;
	
	public BaseRepoImpl() {
		init();
	}

	@SuppressWarnings("rawtypes")
	private void init() {
		try {
			Class class1 = this.getClass();
			TypeVariable[] parameters = class1.getTypeParameters();
			for(TypeVariable p : parameters){
				System.out.println(p.getName());
			}
			// ��ȡ��ǰ������
			Type type = this.getClass().getGenericSuperclass();
			if (type.toString().indexOf("BaseRepoImpl") != -1) {
				ParameterizedType type1 = (ParameterizedType) type;
				Type[] types = type1.getActualTypeArguments();
				setClazz((Class) types[0]);
			} else {
				type = ((Class) type).getGenericSuperclass();
				ParameterizedType type1 = (ParameterizedType) type;
				Type[] types = type1.getActualTypeArguments();
				setClazz((Class) types[0]);
			}
		} catch (Exception er) {
			System.err.println("��ʼ������ʧ��"+ er);
			log.error("��ʼ������ʧ��", er);
		}
	}

	@SuppressWarnings("rawtypes")
	public Class getClazz() {
		return clazz;
	}

	@SuppressWarnings("rawtypes")
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	
}

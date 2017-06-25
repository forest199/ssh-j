package com.forest.dandan.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.forest.dandan.repos.base.BaseRepo;
import com.forest.dandan.services.BaseService;

public class BaseImpl<T> implements BaseService<T>{

	@Autowired
	private BaseRepo<T, Long> repo;
	
	public List<T> findAll() {
		return repo.findAll();
	}

}

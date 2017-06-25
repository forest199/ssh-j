package com.forest.dandan.repos.base;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<T,ID extends Serializable> extends JpaRepository<T, Serializable>,JpaSpecificationExecutor<T> {

	
	
}

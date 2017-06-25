package com.forest.dandan.common.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.forest.dandan.common.constant.App;

public class BaseController {

	/**
	 * ·â×°Pageable¶ÔÏó
	 * */
	protected Pageable getPageInfo(Integer pageNo,Integer pageSize){
		int num = (pageNo==null)?App.pageNo:pageNo;
		int size = (pageSize==null)?App.pageSize:pageSize;
		return new PageRequest(num, size);
	}
	
	
}

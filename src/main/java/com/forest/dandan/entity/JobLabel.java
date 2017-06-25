package com.forest.dandan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 一般任务不都得有个标签嘛！
 * 有标签才容易分类嘛，以后对哪些标签有兴趣就可以直接关注啦！
 * 一个牛逼的功能啊！！！
 * */
@Entity
@Table
public class JobLabel {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String labelName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	
	
}

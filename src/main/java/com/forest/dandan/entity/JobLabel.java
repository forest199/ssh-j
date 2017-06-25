package com.forest.dandan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * һ�����񲻶����и���ǩ�
 * �б�ǩ�����׷�����Ժ����Щ��ǩ����Ȥ�Ϳ���ֱ�ӹ�ע����
 * һ��ţ�ƵĹ��ܰ�������
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

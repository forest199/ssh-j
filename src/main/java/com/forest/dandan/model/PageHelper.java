package com.forest.dandan.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;

@SuppressWarnings("unused")
public class PageHelper<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**ҳ��*/
	private int pageNo;
	
	/**ÿҳ����*/
	private int pageSize;
	
	/**��ҳ��*/
	private int totalPage;
	
	/**������*/
	private int totalCount;
	
	/**�Ƿ�����һҳ*/
	private boolean hasNextPage;
	
	/**�Ƿ�����һҳ*/
	private boolean hasPrevPage;
	
	/**����*/
	private List<T> content;

	public PageHelper(){}
	
	public PageHelper(int pageNo, int totalCount, List<T> content) {
		super();
		this.pageNo = pageNo;
		this.totalCount = totalCount;
		this.content = content;
	}
	
	public PageHelper(int totalCount,Pageable page){
		super();
		this.totalCount = totalCount;
		if(page != null){
			this.pageNo = page.getPageNumber()+1;
			this.pageSize = page.getPageSize();
		}
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return (int)(Math.ceil(((double)totalCount)/getPageSize()));
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public boolean isHasNextPage() {
		return getTotalPage()>getPageNo();
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public boolean isHasPrevPage() {
		return getPageNo()>0 && getTotalPage()>0;
	}

	public void setHasPrevPage(boolean hasPrevPage) {
		this.hasPrevPage = hasPrevPage;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

}

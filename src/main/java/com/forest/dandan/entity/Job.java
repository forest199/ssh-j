package com.forest.dandan.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Job {

	@Id
	@GeneratedValue
	private Long id;
	
	/**�������*/
	private String title;
	
	/**��������*/
	private String content;
	
	/**���񱨳�*/
	private double money;
	
	/**����ʱ��*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date publishTime;
	
	/**��ֹʱ��*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date EndTime;
	
	/**�Ƿ����������ͬʱ�ӵ���Ĭ��0Ϊ���У��������*/
	private Integer isMultiple=0;
	
	/**�����ǩ*/
	@ManyToOne
	@JoinColumn(name="labelId")
	private JobLabel jobLabel;
	
	/**�ϴ���ͼƬ����*/
	@OneToMany
	@JoinColumn(name="jobId")
	private Set<ImageFileForJob> images;
	
	/**������*/
	@ManyToOne
	@JoinColumn(name="publishUserId")
	private User publishMan;
	
	/**�ӵ��ߣ������Ƿ������Ϊ�ɶ��˽ӵ��������isMultiple����˵���� */
	@OneToMany
	@JoinTable(name="take_job_user",
	    joinColumns={@JoinColumn(name="job_id",referencedColumnName="id")},
	    inverseJoinColumns={@JoinColumn(name="user_id",referencedColumnName="id")})
	private Set<User> takeJobUsers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getEndTime() {
		return EndTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
	}

	public Integer getIsMultiple() {
		return isMultiple;
	}

	public void setIsMultiple(Integer isMultiple) {
		this.isMultiple = isMultiple;
	}

	public Set<ImageFileForJob> getImages() {
		return images;
	}

	public void setImages(Set<ImageFileForJob> images) {
		this.images = images;
	}

	public User getPublishMan() {
		return publishMan;
	}

	public void setPublishMan(User publishMan) {
		this.publishMan = publishMan;
	}

	public Set<User> getTakeJobUsers() {
		return takeJobUsers;
	}

	public void setTakeJobUsers(Set<User> takeJobUsers) {
		this.takeJobUsers = takeJobUsers;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}

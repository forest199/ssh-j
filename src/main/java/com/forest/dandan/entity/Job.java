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
	
	/**任务标题*/
	private String title;
	
	/**任务内容*/
	private String content;
	
	/**任务报酬*/
	private double money;
	
	/**发布时间*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date publishTime;
	
	/**截止时间*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date EndTime;
	
	/**是否请允许多人同时接单，默认0为不行，否则可以*/
	private Integer isMultiple=0;
	
	/**任务标签*/
	@ManyToOne
	@JoinColumn(name="labelId")
	private JobLabel jobLabel;
	
	/**上传的图片附件*/
	@OneToMany
	@JoinColumn(name="jobId")
	private Set<ImageFileForJob> images;
	
	/**发布者*/
	@ManyToOne
	@JoinColumn(name="publishUserId")
	private User publishMan;
	
	/**接单者，这里是否可设置为可多人接单，上面的isMultiple属性说了算 */
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

package com.forest.dandan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	/**用户名*/
	private String name;
	
	/**真实姓名*/
	private String trueName;
	
	/**密码，可加密*/
	private String pass;
	
	/**手机*/
	private String phone;
	
	/**性别*/
	private char sex;
	
	/**年龄*/
	private int age;
	
	/**生日日期时间*/
	private Date birthday;
	
	/**地址*/
	private String address;
	
	/**身份证*/
	private String card;
	
	/**邮件*/
	private String email;
	
	private boolean disabled;
	
	/**注册时间*/
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mi:ss")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date register;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Date getRegister() {
		return register;
	}

	public void setRegister(Date register) {
		this.register = register;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", trueName=" + trueName + ", pass=" + pass + ", phone=" + phone
				+ ", sex=" + sex + ", age=" + age + ", birthday=" + birthday + ", address=" + address + ", card=" + card
				+ ", email=" + email + ", disabled=" + disabled + ", register=" + register + "]";
	}
	
	
}

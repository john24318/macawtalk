package com.macaw.entity;

// Generated 2012/7/15 �U�� 10:39:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "macaw")
public class User implements java.io.Serializable {

	private String username;
	private String password;
	private String email1;
	private String email2;
	private String nickname;
	private String secretqes;
	private String secretans;
	private String sex;
	private String country;
	private String tel;
	private String mobile;
	private String address;
	private String vocation;
	private String profile;
	private Date regtime;

	public User() {
	}

	public User(String username) {
		this.username = username;
	}

	public User(String username, String password, String email1, String email2,
			String nickname, String secretqes, String secretans, String sex,
			String country, String tel, String mobile, String address,
			String vocation, String profile, Date regtime) {
		this.username = username;
		this.password = password;
		this.email1 = email1;
		this.email2 = email2;
		this.nickname = nickname;
		this.secretqes = secretqes;
		this.secretans = secretans;
		this.sex = sex;
		this.country = country;
		this.tel = tel;
		this.mobile = mobile;
		this.address = address;
		this.vocation = vocation;
		this.profile = profile;
		this.regtime = regtime;
	}

	@Id
	@Column(name = "USERNAME", unique = true, nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EMAIL1", length = 50)
	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	@Column(name = "EMAIL2", length = 50)
	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	@Column(name = "NICKNAME", length = 50)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "SECRETQES", length = 100)
	public String getSecretqes() {
		return this.secretqes;
	}

	public void setSecretqes(String secretqes) {
		this.secretqes = secretqes;
	}

	@Column(name = "SECRETANS", length = 50)
	public String getSecretans() {
		return this.secretans;
	}

	public void setSecretans(String secretans) {
		this.secretans = secretans;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "COUNTRY", length = 10)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "TEL", length = 45)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "MOBILE", length = 45)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "ADDRESS", length = 150)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "VOCATION", length = 20)
	public String getVocation() {
		return this.vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	@Column(name = "PROFILE", length = 200)
	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REGTIME", length = 19)
	public Date getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

}
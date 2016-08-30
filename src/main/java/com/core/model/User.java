package com.core.model;

public class User {
	// 用户编号
	private Integer userid;
	// 用户姓名
	private String username;
	// 用户年龄
	private String age;
	// 用户性别
	private String sex;
	// 用户生日
	private String birthday;
	// 用户学历
	private String education;
	// 工作
	private String jobs;
	// qq
	private String qq;
	// 电话
	private String tel;
	// 爱好
	private String interest;
	// 自我介绍
	private String introduce;
	// 创建时间
	private String creatdate;
	// 最后修改时间
	private String editdate;
	// 修改人id
	private String id;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age == null ? null : age.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday == null ? null : birthday.trim();
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education == null ? null : education.trim();
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs == null ? null : jobs.trim();
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest == null ? null : interest.trim();
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
	}

	public String getCreatdate() {
		return creatdate;
	}

	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate == null ? null : creatdate.trim();
	}

	public String getEditdate() {
		return editdate;
	}

	public void setEditdate(String editdate) {
		this.editdate = editdate == null ? null : editdate.trim();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}
}
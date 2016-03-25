package com.iqiyi.oauth2.server.pojo;

/**
 * 
 * @Title: Users.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 * 奇艺用户基础信息
 * 对应passport数据库表：qiyi_profile
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-14 下午4:06:27
 * @author shuhuan@qiyi.com
 */
public class Users extends BaseObject {

	private static final long serialVersionUID = 7014670964457201069L;

	private String suid;        // 奇艺用户uid
	
	private String uname;       // 奇艺用户昵称
	
	private String passwd;      // 密码
	
	private String email;       // 邮箱
	
	private String phone;       // 电话
	
	private String gender;      // 性别
	
	private String birthday;    // 生日
	
	private String province;    // 省份
	
	private String city;        // 城市
	
	private String edu;         // 学历
	
	private String work;        // 工作
	
	private String personal_url;// 个人主页
	
	private String real_name;   // 真实姓名
	
	private String self_intro;  // 自我介绍
	
	private String icon;        // 头像

	public String getSuid() {
		return suid;
	}

	public void setSuid(String suid) {
		this.suid = suid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getPersonal_url() {
		return personal_url;
	}

	public void setPersonal_url(String personal_url) {
		this.personal_url = personal_url;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getSelf_intro() {
		return self_intro;
	}

	public void setSelf_intro(String self_intro) {
		this.self_intro = self_intro;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((edu == null) ? 0 : edu.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		result = prime * result
				+ ((personal_url == null) ? 0 : personal_url.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result
				+ ((real_name == null) ? 0 : real_name.hashCode());
		result = prime * result
				+ ((self_intro == null) ? 0 : self_intro.hashCode());
		result = prime * result + ((suid == null) ? 0 : suid.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (edu == null) {
			if (other.edu != null)
				return false;
		} else if (!edu.equals(other.edu))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (icon == null) {
			if (other.icon != null)
				return false;
		} else if (!icon.equals(other.icon))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		if (personal_url == null) {
			if (other.personal_url != null)
				return false;
		} else if (!personal_url.equals(other.personal_url))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (real_name == null) {
			if (other.real_name != null)
				return false;
		} else if (!real_name.equals(other.real_name))
			return false;
		if (self_intro == null) {
			if (other.self_intro != null)
				return false;
		} else if (!self_intro.equals(other.self_intro))
			return false;
		if (suid == null) {
			if (other.suid != null)
				return false;
		} else if (!suid.equals(other.suid))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [suid=" + suid + ", uname=" + uname + ", passwd="
				+ passwd + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", birthday=" + birthday
				+ ", province=" + province + ", city=" + city + ", edu=" + edu
				+ ", work=" + work + ", personal_url=" + personal_url
				+ ", real_name=" + real_name + ", self_intro=" + self_intro
				+ ", icon=" + icon + "]";
	}

}

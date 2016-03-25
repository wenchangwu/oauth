package com.oauth.sh.sqlmap.mybatis.model;

public class QiyiProfile {
    private Integer suid;

    private Integer puid;

    private String uname;

    private String email;

    private String acode;

    private Byte activated;

    private String passwd;

    private String phone;

    private Byte gender;

    private Integer birthday;

    private Byte province;

    private Byte city;

    private Byte status;

    private String icon;

    private Byte work;

    private Byte income;

    private String regip;

    private Integer jointime;

    private String extinfo;

    private String question;

    private String answer;

    private Byte source;

    private String fromurl;

    private Boolean emailOrMobile;

    private Byte edu;

    private Byte industry;

    private String selfIntro;

    private String realName;

    private String personalUrl;

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode == null ? null : acode.trim();
    }

    public Byte getActivated() {
        return activated;
    }

    public void setActivated(Byte activated) {
        this.activated = activated;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Byte getProvince() {
        return province;
    }

    public void setProvince(Byte province) {
        this.province = province;
    }

    public Byte getCity() {
        return city;
    }

    public void setCity(Byte city) {
        this.city = city;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getWork() {
        return work;
    }

    public void setWork(Byte work) {
        this.work = work;
    }

    public Byte getIncome() {
        return income;
    }

    public void setIncome(Byte income) {
        this.income = income;
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }

    public Integer getJointime() {
        return jointime;
    }

    public void setJointime(Integer jointime) {
        this.jointime = jointime;
    }

    public String getExtinfo() {
        return extinfo;
    }

    public void setExtinfo(String extinfo) {
        this.extinfo = extinfo == null ? null : extinfo.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public String getFromurl() {
        return fromurl;
    }

    public void setFromurl(String fromurl) {
        this.fromurl = fromurl == null ? null : fromurl.trim();
    }

    public Boolean getEmailOrMobile() {
        return emailOrMobile;
    }

    public void setEmailOrMobile(Boolean emailOrMobile) {
        this.emailOrMobile = emailOrMobile;
    }

    public Byte getEdu() {
        return edu;
    }

    public void setEdu(Byte edu) {
        this.edu = edu;
    }

    public Byte getIndustry() {
        return industry;
    }

    public void setIndustry(Byte industry) {
        this.industry = industry;
    }

    public String getSelfIntro() {
        return selfIntro;
    }

    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro == null ? null : selfIntro.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPersonalUrl() {
        return personalUrl;
    }

    public void setPersonalUrl(String personalUrl) {
        this.personalUrl = personalUrl == null ? null : personalUrl.trim();
    }
}
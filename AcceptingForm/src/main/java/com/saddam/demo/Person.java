package com.saddam.demo;

import javax.validation.constraints.NotBlank;

public class Person {
	private int pid;
	
	@NotBlank(message="Name must not be blank")
	private String pname;
	private String lang;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	

}

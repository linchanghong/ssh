package com.bolo.examples.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 欢迎页面
 * @author 
 */
@SuppressWarnings("serial")
public class HelloAction extends ActionSupport{

	public String execute(){
		return SUCCESS;
	}
}
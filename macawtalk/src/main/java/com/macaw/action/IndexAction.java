package com.macaw.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IndexAction() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("IndexAction created on " + df.format(new Date()));
	}
	
	public String index() {
		return "success";
	}
	
}

package com.macaw.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Component;


import com.opensymphony.xwork2.ActionSupport;

@Component("IndexAction")
public class IndexAction extends ActionSupport {
	
	public IndexAction() {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("IndexAction created on " + df.format(new Date()));
	}
	
	public String index() {
		return "success";
	}
	
}

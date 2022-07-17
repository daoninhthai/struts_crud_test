package com.stackjava.models;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class User extends ActionForm {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	@Override
//	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//		ActionErrors actionErrors=new ActionErrors();
//		if(name==null || name.equals("")) {
//			actionErrors.add("user.name.required", new ActionMessage("error.user.name.required"));
//		}
//		if( age<0) {
//			actionErrors.add("user.age.invalid"	, new ActionMessage("error.user.age.invalid"));
//		}
//		return actionErrors;
//		
//	}
	
}

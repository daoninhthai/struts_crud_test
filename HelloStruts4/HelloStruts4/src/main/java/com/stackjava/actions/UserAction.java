package com.stackjava.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.stackjava.dao.UserDAO;
import com.stackjava.models.User;
import com.stackjava.service.UserService;

public class UserAction extends MappingDispatchAction {
	private UserService userService;
	public UserAction() {
		userService= new UserService();
	}
	
	public ActionForward addUserPost(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		User user =(User) form;
		userService.addUser(user);
		return mapping.findForward("success");

	}
	public ActionForward editUserPost(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		User user =(User) form;
		userService.updateUser(user);
		return mapping.findForward("success");

	}
	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int id = Integer.valueOf(request.getParameter("userId"));
		UserService userDAO = new UserService();
		User user = userDAO.getUserById(id);
		
		request.setAttribute("user", user);
		return mapping.findForward("viewUser");

	}
	
	public ActionForward listUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		UserService userDAO = new UserService();
		List<User> user = userDAO.getAllUser();
		
		request.setAttribute("userList", user);
		return mapping.findForward("listUser");

	}
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int id = Integer.valueOf(request.getParameter("userId"));
		UserService userDAO = new UserService();
		User user = userDAO.getUserById(id);
	
		
		request.setAttribute("user", user);
		return mapping.findForward("updateUser");

	}
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {


		int id = Integer.valueOf(request.getParameter("userId"));
		userService.deleteUser(id);
		return mapping.findForward("success");

	}


}

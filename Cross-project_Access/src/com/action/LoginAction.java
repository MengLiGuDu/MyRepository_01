package com.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.UserBean;
import com.service.UserService;

/*
 * .action����Ŀ����
 */
@Controller
public class LoginAction {
	
	@Resource(name="UserService")
	private UserService userService;
	
	public static void main(String[] args) {
		System.out.println("���ڲ���");
		System.out.println("�ҵڶ��β���");
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public Object Login(HttpServletRequest req,UserBean bean,String password){
		System.out.println("�����������ڵ�="+req.getHeader("Referer"));
		System.out.println("���չ������ڵ�="+req.getContextPath());
		System.out.println("id="+bean.getId()+"  name="+bean.getName()+" password="+password);
		return true;
	}
}

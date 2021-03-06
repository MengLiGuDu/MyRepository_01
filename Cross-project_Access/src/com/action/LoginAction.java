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
 * .action跨项目访问
 */
@Controller
public class LoginAction {
	
	@Resource(name="UserService")
	private UserService userService;
	
	public static void main(String[] args) {
		System.out.println("我在测试");
		System.out.println("我第二次测试");
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public Object Login(HttpServletRequest req,UserBean bean,String password){
		System.out.println("发送请求所在地="+req.getHeader("Referer"));
		System.out.println("接收工程所在地="+req.getContextPath());
		System.out.println("id="+bean.getId()+"  name="+bean.getName()+" password="+password);
		return true;
	}
}

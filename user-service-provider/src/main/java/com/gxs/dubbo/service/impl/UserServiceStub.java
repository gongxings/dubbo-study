package com.gxs.dubbo.service.impl;

import java.util.List;

import com.gxs.dubbo.beans.UserAddress;
import com.gxs.dubbo.service.UserService;
import com.sun.xml.internal.ws.util.StringUtils;

public class UserServiceStub implements UserService {
	
	private final UserService userService;
	

	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....");
		if(null!=userId||!"".equals(userId)) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
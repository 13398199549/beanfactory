package org.framestudy.beanfactory.usermag.service.impl;

import org.framestudy.beanfactory.BeanFactory;
import org.framestudy.beanfactory.bean.UserBean;
import org.framestudy.beanfactory.usermag.service.IUserService;
import org.framestudy.beanfactory.util.PropertisUtils;
import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {

	private IUserService userServiceImpl;
	
	@Before
	public void before() {
		PropertisUtils prop = new PropertisUtils();
		userServiceImpl = (IUserService) BeanFactory.getBean(prop.getValue("userServiceImpl"));
	}
	
	@Test
	public void saveUserBean() {
		UserBean user = new UserBean();
		user.setId(1L);
		user.setUserName("张明");
		user.setPassword("123456");
		
		userServiceImpl.saveUserBean(user);
	}
	
	
	
	
	
}

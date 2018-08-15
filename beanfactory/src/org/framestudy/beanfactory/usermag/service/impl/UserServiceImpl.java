package org.framestudy.beanfactory.usermag.service.impl;

import org.framestudy.beanfactory.bean.UserBean;
import org.framestudy.beanfactory.usermag.dao.IUserDao;
import org.framestudy.beanfactory.usermag.service.IUserService;
/**
 * 用户业务实现类
 * @author puxubo
 *
 */
public class UserServiceImpl implements IUserService {

	private IUserDao userDaoImpl;

	@Override
	public void saveUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.saveUserBean(user);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.updateUserBean(user);
	}

	@Override
	public void deleteUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUserBean(user);
	}

	@Override
	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	}

}

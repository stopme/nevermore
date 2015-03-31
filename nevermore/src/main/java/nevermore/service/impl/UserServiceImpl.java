package nevermore.service.impl;

import nevermore.dao.UserDao;
import nevermore.dto.User;
import nevermore.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public User findUserByID(String id) {
		// TODO Auto-generated method stub
		return userDao.findUserByID(id);
	}
	

}

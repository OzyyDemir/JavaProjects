package javaETicaret.business.concretes;

import java.util.List;
import javaETicaret.business.abstracts.UserService;
import javaETicaret.core.abstracts.AuthService;
import javaETicaret.dataAccess.abstracts.UserDao;
import javaETicaret.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
		
	}

	@Override
	public void add(User user) {
		
		userDao.add(user);
		
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return userDao.getall();
	}

	@Override
	public void signIn(User user) {
		
		
	}
	

}

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
		if(user.getPassword().length()<8) {
			System.out.println("þifre kýsa");
			return;
		}
		this.userDao.add(user);
		
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

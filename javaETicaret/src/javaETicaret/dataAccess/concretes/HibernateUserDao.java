package javaETicaret.dataAccess.concretes;

import java.util.List;

import javaETicaret.dataAccess.abstracts.UserDao;
import javaETicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User added "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}

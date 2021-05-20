package javaETicaret.dataAccess.abstracts;

import java.util.List;

import javaETicaret.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getall();

}

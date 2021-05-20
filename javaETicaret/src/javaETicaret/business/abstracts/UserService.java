package javaETicaret.business.abstracts;

import java.util.List;

import javaETicaret.entities.concretes.User;

public interface UserService {
	void add(User user);
	void signIn(User user);
	List<User> getall();

}

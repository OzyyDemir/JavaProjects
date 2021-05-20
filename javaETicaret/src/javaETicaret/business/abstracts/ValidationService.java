package javaETicaret.business.abstracts;

import javaETicaret.entities.concretes.User;

public interface ValidationService {
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
	boolean emailIsVerified(User user);
	boolean passwordIsVerified(User user);

}

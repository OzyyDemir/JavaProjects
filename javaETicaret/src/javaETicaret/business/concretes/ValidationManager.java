package javaETicaret.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaETicaret.business.abstracts.ValidationService;
import javaETicaret.entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean firstNameIsVerified(User user) {
		if(user.getFirstName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lastNameIsVerified(User user) {
		if(user.getLastName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean emailIsVerified(User user) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches() == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean passwordIsVerified(User user) {
		if(user.getPassword().length() >= 6) {
			return true;
		}
		return false;
	}
}

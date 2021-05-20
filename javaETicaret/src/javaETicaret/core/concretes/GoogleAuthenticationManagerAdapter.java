package javaETicaret.core.concretes;

import javaETicaret.core.abstracts.AuthService;
import javaETicaret.googleAuthenticator.GoogleAuthenticatorManager;

public class GoogleAuthenticationManagerAdapter implements AuthService{
	GoogleAuthenticatorManager googleAuthManager = new GoogleAuthenticatorManager();

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		googleAuthManager.register(id, firstName, lastName, email, password);
		System.out.println("Registed : "+email);
		
		
	}

	@Override
	public void login(String email, String password) {
		googleAuthManager.login(email, password);
		System.out.println("Login :" +email);
		
	}

}

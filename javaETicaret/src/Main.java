import javaETicaret.business.abstracts.UserService;
import javaETicaret.business.concretes.UserManager;
import javaETicaret.dataAccess.concretes.HibernateUserDao;
import javaETicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao());
		
		
		User user = new User(1,"Ali","Atýf","mail@gmail.com","password");

		userService.add(user);

	}

}

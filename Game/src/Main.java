import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1,"Ali","Mert","Korkusuz","12313124");
		GamerManager manager = new GamerManager();
		manager.add(gamer);
		
		

	}

}

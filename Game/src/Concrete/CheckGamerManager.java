package Concrete;

import Abstract.CheckGamerService;
import Entities.Gamer;

public class CheckGamerManager implements CheckGamerService{

	@Override
	public boolean checkGamerIsReal(Gamer gamer) {
		
		return true;
	}

}

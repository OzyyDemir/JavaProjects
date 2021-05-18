package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + "sale this " + game.getGameName());
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + "take " + game.getGameName() + "with using campaign"+campaign.getCampaingName());
		
	}

}

package Entities;

import Abstract.IEntity;

public class Game implements IEntity{
	private int id;
	private String gameName;
	private int unitPrice;
	
	
	public Game(int id, String gameName, int unitPrice)
	{
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}

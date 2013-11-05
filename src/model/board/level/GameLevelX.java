package model.board.level;

import java.awt.Point;


import model.board.Board;
import model.element.Armor;
import model.element.Wall;
import model.fighter.FighterHero;
import model.fighter.Goblin;
import model.fighter.Golem;
import model.fighter.Hero;
import model.fighter.Serpent;
import model.fighter.level.LevelEnemies;

public class GameLevelX extends Board{
	private int enemies = 5;
	private Point heroInitPosition = new Point(3,2); // a mano

	@Override
	/*
	 * Puede estar todo al reves, porque Laura uso otra Logica
	 */
	protected void setContents() {
		//get((int)heroInitPosition.getX(), (int)heroInitPosition.getY()).setContent(new FighterHero()); aqui no es donde se agrega el hero
		get(1,6).setContent(new Goblin(new LevelEnemies(1)));
		get(7,7).setContent(new Serpent(new LevelEnemies(2)));
		get(8,3).setContent(new Golem(new LevelEnemies(3)));
		get(1,10).setContent(new Serpent(new LevelEnemies(1)));
		get(6,2).setContent(new Goblin(new LevelEnemies(1)));
		get(0,0).setContent(new Armor());
		// ponemos las paredes 
		get(2,6).setContent(new Wall());
		get(3,6).setContent(new Wall());
		get(4,6).setContent(new Wall());
		get(5,6).setContent(new Wall());
		get(8,6).setContent(new Wall());
		get(9,6).setContent(new Wall());
		get(10,6).setContent(new Wall());
		get(11,6).setContent(new Wall());
		get(8,0).setContent(new Wall());
		get(8,1).setContent(new Wall());
		get(8,2).setContent(new Wall());
		get(8,4).setContent(new Wall());
		get(8,5).setContent(new Wall());
		get(8,8).setContent(new Wall());
		get(7,8).setContent(new Wall());
		get(7,9).setContent(new Wall());
		get(7,10).setContent(new Wall());
		get(7,11).setContent(new Wall());
		get(7,8).setContent(new Wall());
		get(7,8).setContent(new Wall());
		get(9,8).setContent(new Wall());
		get(10,8).setContent(new Wall());
		
	}
	
	public void reduceNumberOfEnemies(){
		enemies--;
	}

	@Override
	protected Point getHeroInitPosition() {
		return new Point(3,2);
	}

	@Override
	public boolean gameOver() {
		return !getHero().isAlive() || playerWon();
	}

	@Override
	public boolean playerWon() {
		return enemies == 0;
	}
	
}

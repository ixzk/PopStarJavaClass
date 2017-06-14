package cn.campsg.practical.bubble.service;

import cn.campsg.practical.bubble.entity.Position;
import cn.campsg.practical.bubble.entity.Star;
import cn.campsg.practical.bubble.entity.StarList;
import cn.campsg.practical.bubble.entity.Star.StarType;

public class StarServiceTester implements StarService{

	public static void main(String[] args) {
		StarServiceTester starService = new StarServiceTester();
		StarList sList = starService.createStars();
		
	}
	@Override
	public StarList createStars() {
		
		StarList sList = new StarList();
		sList.add(new Star(new Position(0,0),StarType.BLUE));
		sList.add(new Star(new Position(0,1),StarType.GREEN));
		sList.add(new Star(new Position(1,0),StarType.PURPLE));
		sList.add(new Star(new Position(1,1),StarType.YELLOW));
		sList.add(new Star(new Position(0,2),StarType.RED));
		return sList;
	}

	@Override
	public StarList tobeClearedStars(Star base, StarList sList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StarList getYMovedStars(StarList clearStars, StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StarList getXMovedStars(StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tobeEliminated(StarList currentStarList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StarList getAwardStarList(StarList currentStarList) {
		// TODO Auto-generated method stub
		return null;
	}

}

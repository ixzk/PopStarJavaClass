package cn.campsg.practical.bubble.entity;

public class Star {
	public enum StarType{
		BLUE(0),GREEN(1),YELLOW(2),RED(3),PURPLE(4);
		
		private int index;
		
		private StarType(){
			
		}
		
		private StarType(int index){
			this.index = index;
		}
		
		public int value(){
			return index;
		}
		
		public static StarType valueOf(int index){
			StarType type;
			switch (index) {
			case 0:
				type = BLUE;	
				break;
			case 1:
				type = GREEN;
				break;
			case 2:
				type = YELLOW;
				break;
			case 3:
				type = RED;
				break;
			case 4:
				type = PURPLE;
				break;
			default:
				type = BLUE;
				break;
			}
			return type;
		}
	}
	
	private Position position = new Position();
	private StarType type;
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public StarType getType() {
		return type;
	}
	public void setType(StarType type) {
		this.type = type;
	}
	
	public Star(){
		type = StarType.BLUE;
	}
	
	public Star(Position position,StarType type){
		this.position = position;
		this.type = type;
	}
	
}
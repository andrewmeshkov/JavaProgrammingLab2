package Moves;

import ru.ifmo.se.pokemon.*;

public class Magnitude extends PhysicalMove{

	public boolean isBetween(int left, int rigth, int num) {
		return left <= num && num <= rigth;
	}
	
	public Magnitude() {
		super(Type.GROUND, 0, 100);
		setPower();
	}
	
	void setPower() {
		int magnitude = (int) (Math.random() * 99 + 1);
		if(isBetween(1, 5, magnitude)) {
			this.power = 10;
		}
		else if(isBetween(6, 15, magnitude)) {
			this.power = 30;
		}
		else if(isBetween(16, 35, magnitude)) {
			this.power = 50;
		}
		else if(isBetween(36, 65, magnitude)) {
			this.power = 70;
		}
		else if(isBetween(66, 85, magnitude)) {
			this.power = 90;
		}
		else if(isBetween(86, 95, magnitude)) {
			this.power = 110;
		}
		else {
			this.power = 150;
		}
	}


	@Override
	public String describe() {
		return "strike the ground";
	}
	
}

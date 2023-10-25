package Moves;

import ru.ifmo.se.pokemon.*;

public class TripleKick extends PhysicalMove{
	
	private static int count = 0;
	
	public static int getPower() {
		if(Math.random() <= 0.90) {
			count++;
			if(Math.random() <= 0.81) {
				count++;
				if(Math.random() <= 0.73) {
					count++;
					return 60;
				}
				return 30;
			}
			return 10;
		}
		return 0;
	}
	
	public TripleKick() {
		super(Type.FIGHTING, getPower() , 90);
	}
	
	@Override 
	public String describe() {
		return String.format("strikes for %d times", count);
	}
}

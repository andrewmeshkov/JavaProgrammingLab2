package Moves;

import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove{
	
	public HydroPump() {
		super(Type.WATER, 110, 80);
	}
	
	@Override 
	public String describe() {
		return "beat with a stream of water";
	}
	
}

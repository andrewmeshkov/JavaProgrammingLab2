package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowPunch extends PhysicalMove{
	public ShadowPunch() {
		super(Type.GHOST, 60, Integer.MAX_VALUE);
	}
	
	public String describe() {
		return "attack from shadow";
	}
}

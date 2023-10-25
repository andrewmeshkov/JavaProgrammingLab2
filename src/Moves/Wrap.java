package Moves;

import ru.ifmo.se.pokemon.*;

public class Wrap extends PhysicalMove{
	public Wrap() {
		super(Type.NORMAL, 15, 90);
	}

	@Override
	protected void applyOppEffects(Pokemon opp) {
		opp.setMod(Stat.HP, (int) opp.getHP()* (1/8));
	}
	
	@Override
	public String describe() {
		return "wrap the opponent";
	}
}

package Moves;

import ru.ifmo.se.pokemon.*;

public class BatonPass extends StatusMove{
	public BatonPass() {
		super(Type.NORMAL, 0, 0);
	}
	
	
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		Effect.confuse(pokemon);
	}



	@Override
	public String describe() {
		return "get confused";
	}
}

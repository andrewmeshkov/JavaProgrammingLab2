package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove{
	public IceBeam() {
		super(Type.ICE, 90, 100);
	}
	
	private boolean bool;
	
	@Override
	public void applyOppEffects(Pokemon pokemon) {
		if(Math.random() <= 0.1) {
			bool = true;
			Effect.freeze(pokemon);
		}
	}
	
	@Override
	public String describe() {
		if(bool) {
			return "freeze and deal damage"; 
		}
		return "deal damage";
	}
}

package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudSlap extends SpecialMove{
	public MudSlap() {
		super(Type.GROUND, 20, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon opp) {
		opp.setMod(Stat.ACCURACY, -1);
	}
	
	@Override
	public String describe() {
		return "beat with dirt";
	}
}

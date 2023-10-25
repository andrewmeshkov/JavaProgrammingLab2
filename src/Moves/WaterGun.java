package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove{
	public WaterGun() {
		super(Type.WATER, 40, 100);
	}
	@Override 
	public String describe() {
		return "deal damage with water gun";
	}
}

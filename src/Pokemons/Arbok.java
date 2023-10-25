package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Arbok extends Ekans {
	public Arbok(String name, int level) {
		super(name, level);
		setStats(60, 95, 69, 65, 79, 80);
		setType(Type.POISON);
		setMove(new HydroPump(), new ShadowPunch(), new IcePunch(), new Wrap());
	}
}

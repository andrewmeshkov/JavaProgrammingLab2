package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dialga extends Pokemon{
	public Dialga(String name, int level) {
		super(name, level);
		setStats(100, 120, 120, 150, 100, 90);
		setType(Type.STEEL, Type.DRAGON);
		setMove(new Magnitude(), new ShadowPunch(), new TripleKick());
	}
}

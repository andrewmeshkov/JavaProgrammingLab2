package Pokemons;

import Moves.HydroPump;
import Moves.IcePunch;
import Moves.ShadowPunch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ekans extends Pokemon{
	public Ekans(String name, int level) {
		super(name , level);
		setStats(35, 60, 44, 40, 54, 55);
		setType(Type.POISON);
		setMove(new HydroPump(), new ShadowPunch(), new IcePunch());
	}
}

package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Jolteon extends Pokemon {
	public Jolteon(String name, int level) {
		super(name, level);
		setStats(65, 65, 60, 110, 95, 130);
		setType(Type.ELECTRIC);
		setMove(new HydroPump(), new ShadowPunch());
	}
}

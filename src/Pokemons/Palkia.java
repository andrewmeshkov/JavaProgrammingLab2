package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Palkia extends Pokemon{
	public Palkia(String name, int level) {
		super(name, level);
		setStats(90, 120, 100, 150, 120, 100);
		setType(Type.WATER);
		setMove(new Magnitude(), new ShadowPunch(), new TripleKick(), new MudSlap());
	}
}

package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spearow extends Pokemon{
	public Spearow(String name, int level) {
		super(name, level);
		setStats(40, 60, 30, 31, 31, 70);
		setType(Type.NORMAL, Type.FLYING);
		setMove(new IceBeam(), new BatonPass(), new WaterGun(), new ShadowPunch());
	}
}

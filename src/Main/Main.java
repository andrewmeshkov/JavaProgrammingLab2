package Main;
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
	public static void main(String[] args) {
		Battle battle = new Battle();
		Jolteon jolteon = new Jolteon("Jolteon", 10);
		Ekans ekans = new Ekans("Ekans", 8);
		Arbok arbok = new Arbok("Arbok", 9);
		Dialga dialga = new Dialga("Dialga", 11);
		Spearow spearow = new Spearow("Spearow", 2);
		Palkia palkia = new Palkia("Palkia", 12);
		battle.addAlly(jolteon);
		battle.addAlly(ekans);
		battle.addAlly(arbok);
		battle.addFoe(dialga);
		battle.addFoe(palkia);
		battle.addFoe(spearow);
		battle.go();
	}
}

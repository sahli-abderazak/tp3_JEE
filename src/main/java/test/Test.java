package test;

import java.util.List;

import metier.Film;
import metier.MetierImpl;

public class Test {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Film> film = metier.getFilmsParMotCle("AKA");
		for (Film f : film)
		System.out.println(f.getNomFilm());
	}

}

package metier;

import java.util.List;

public interface ImetierCatalogue {
	
	public List<Film> getFilmsParMotCle(String mc);

	public void addFilm(Film f);
}

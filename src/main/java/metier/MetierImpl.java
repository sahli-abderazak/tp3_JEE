package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue{
	@Override
	public List<Film> getFilmsParMotCle(String mc) {
	List<Film> film= new ArrayList<Film>();
	Connection conn=SingletonConnection.getConnection();
	try {

	PreparedStatement ps= conn.prepareStatement("select * from FILMS where NOM_FILMS LIKE ?");

	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	Film f = new Film();
	f.setIdFilm(rs.getLong("ID_FILMS"));
	f.setNomFilm(rs.getString("NOM_FILMS"));
	f.setRateFilm(rs.getFloat("RATE_FILMS"));
	f.setGenreFilm(rs.getString("GENRE"));
	film.add(f);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return film;
	}

	@Override
	public void addFilm(Film f) {
		// TODO Auto-generated method stub
		
	}

}

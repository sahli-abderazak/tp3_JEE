package metier;
import java.io.Serializable;

public class Film {
	private Long idFilm;
	private String nomFilm;
	private float rateFilm;
	private String genreFilm;
	
	
	public Film() {
		super();
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public float getRateFilm() {
		return rateFilm;
	}
	public void setRateFilm(float rateFilm) {
		this.rateFilm = rateFilm;
	}
	public String getGenreFilm() {
		return genreFilm;
	}
	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}
	
	
}

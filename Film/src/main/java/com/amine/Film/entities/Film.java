package com.amine.Film.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String nomFilm;
	private Double rateFilm;
	private Date dateCreation;
	@ManyToOne
	private Genre genre;
	@OneToOne
	private Image image;




	/*public Film() {
		super();
	}*/
	
	/*public Film(String nomFilm, Double rateFilm, Date dateCreation,Genre genre) {
		super();
		this.nomFilm = nomFilm;
		this.rateFilm = rateFilm;
		this.dateCreation = dateCreation;
		this.genre = genre;
	}

	public long getIdFilm() {
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
	public double getRateFilm() {
		return rateFilm;
	}
	public void setRateFilm(Double rateFilm) {
		this.rateFilm = rateFilm;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", rateFilm=" + rateFilm + ", DateCreation="
				+ dateCreation + "]";
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}*/
	
	
	
	
}

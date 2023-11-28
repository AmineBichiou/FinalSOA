package com.amine.Film.dto;

import java.util.Date;

import com.amine.Film.entities.Genre;
import com.amine.Film.entities.Image;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class FilmDTO {
    private Long idFilm;
    private String nomFilm;
    private Double rateFilm;
    private Date dateCreation;
    private Genre genre;
    private Image image;

}

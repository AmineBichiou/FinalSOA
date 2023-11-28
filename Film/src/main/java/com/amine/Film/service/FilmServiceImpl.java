package com.amine.Film.service;

import java.util.List;
import java.util.stream.Collectors;


import com.amine.Film.dto.FilmDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amine.Film.entities.Film;
import com.amine.Film.entities.Genre;
import com.amine.Film.repos.FilmRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	FilmRepository FilmRepository;
	@Autowired
	ModelMapper modelMapper;


	/*@Override
	public Film saveFilm(Film f) {
		
		return FilmRepository.save(f);
	}*/
	@Override
	public FilmDTO saveFilm(FilmDTO f) {
		return convertEntityToDto(FilmRepository.save(convertDtoToEntity(f)));
	}
	@Override
	public FilmDTO getFilm(Long id) {
		return convertEntityToDto(FilmRepository.findById(id).get());
	}
	@Override
	public List<FilmDTO> getAllFilm() {
		return FilmRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
	}



	/*@Override
	public Film updateFilm(Film f) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Film film = mapper.map(f, Film.class);
		FilmRepository.save(film);
		return f;
	}*/
	@Override
	public FilmDTO updateFilm(FilmDTO f) {
		return convertEntityToDto(FilmRepository.save(convertDtoToEntity(f)));
	}

	/*@Override
	public Film updateFilm(Film f) {
		return FilmRepository.save(f);
	}*/

	@Override
	public void deleteFilm(Film f) {
		FilmRepository.delete(f);
		
	}

	@Override
	public void deleteFilmById(Long id) {
		FilmRepository.deleteById(id);
		
	}

	/*@Override
	public Film getFilm(Long id) {
		return FilmRepository.findById(id).get();
	}

	@Override
	public List<Film> getAllFilm() {
		return FilmRepository.findAll();
	}*/

	@Override
	public List<Film> findByNomFilm(String nom) {
		return FilmRepository.findByNomFilm(nom);
	}

	@Override
	public List<Film> findByNomFilmContains(String nom) {
		return FilmRepository.findByNomFilmContains(nom);
	}

	@Override
	public List<Film> findByNomRate(String nom, Double rate) {
		return FilmRepository.findByNomRate(nom,rate);
	}

	@Override
	public List<Film> findByGenre(Genre Genre) {
		return FilmRepository.findByGenre(Genre);
	}

	@Override
	public List<Film> findByGenreIdGenre(Long id) {
		return FilmRepository.findByGenreIdGenre(id);
	}


	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		return FilmRepository.findByOrderByNomFilmAsc();
	}

	@Override
	public List<Film> trierFilmNomsRate() {
		return FilmRepository.trierFilmNomsRate();
	}
	@Override
	public FilmDTO convertEntityToDto(Film film) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		FilmDTO filmDTO = modelMapper.map(film, FilmDTO.class);
		return filmDTO;
	}
	@Override
	public Film convertDtoToEntity(FilmDTO filmDTO) {
		Film film = new Film();
		film = modelMapper.map(filmDTO, Film.class);
		return film;

	}





}

package com.amine.Film.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amine.Film.entities.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
}

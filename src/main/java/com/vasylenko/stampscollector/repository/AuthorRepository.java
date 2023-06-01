package com.vasylenko.stampscollector.repository;

import com.vasylenko.stampscollector.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {

}

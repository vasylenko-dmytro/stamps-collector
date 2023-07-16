package com.vasylenko.stampscollector.repository;

import com.vasylenko.stampscollector.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAuthorsByItemsId(Long itemId);
}

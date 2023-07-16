package com.vasylenko.stampscollector.service;

import com.vasylenko.stampscollector.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Optional<Author> findById(Long id);
    List<Author> getAuthorsByStamp(Long id);
}

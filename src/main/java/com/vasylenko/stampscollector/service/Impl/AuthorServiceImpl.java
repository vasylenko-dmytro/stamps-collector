package com.vasylenko.stampscollector.service.Impl;

import com.vasylenko.stampscollector.domain.Author;
import com.vasylenko.stampscollector.repository.AuthorRepository;
import com.vasylenko.stampscollector.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

  private AuthorRepository repository;

  @Override
  public Optional<Author> findById(Long id) {
    return repository.findById(id);
  }

  @Override
  public List<Author> getAuthorsByStamp(Long id) {
    return repository.findAuthorsByItemsId(id);
  }

}

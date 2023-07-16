package com.vasylenko.stampscollector.service;

import com.vasylenko.stampscollector.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    Optional<Item> findById(Long id);
    List<Item> findAll();
    List<Item> getItemsByAuthor(Long id);
}

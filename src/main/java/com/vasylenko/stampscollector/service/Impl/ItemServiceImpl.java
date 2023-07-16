package com.vasylenko.stampscollector.service.Impl;

import com.vasylenko.stampscollector.domain.Item;
import com.vasylenko.stampscollector.repository.ItemRepository;
import com.vasylenko.stampscollector.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository repository;

    @Override
    public Optional<Item> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Item> getItemsByAuthor(Long id) {
        return repository.findItemsByAuthorsId(id);
    }
}

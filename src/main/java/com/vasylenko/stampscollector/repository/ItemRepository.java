package com.vasylenko.stampscollector.repository;

import com.vasylenko.stampscollector.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findItemsByAuthorsId(Long authorId);
}

package com.vasylenko.stampscollector.repository;

import com.vasylenko.stampscollector.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StampRepository extends JpaRepository<Item, String> {

}

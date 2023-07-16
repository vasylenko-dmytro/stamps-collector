package com.vasylenko.stampscollector.repository;

import com.vasylenko.stampscollector.domain.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}

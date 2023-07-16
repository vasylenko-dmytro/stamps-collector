package com.vasylenko.stampscollector.service;

import com.vasylenko.stampscollector.domain.Series;

import java.util.Optional;

public interface SeriesService {
    Optional<Series> findById(Long id);
}

package com.vasylenko.stampscollector.service.Impl;

import com.vasylenko.stampscollector.domain.Series;
import com.vasylenko.stampscollector.repository.SeriesRepository;
import com.vasylenko.stampscollector.service.SeriesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class SeriesServiceImpl implements SeriesService {

    private SeriesRepository repository;

    @Override
    public Optional<Series> findById(Long id) {
        return repository.findById(id);
    }
}

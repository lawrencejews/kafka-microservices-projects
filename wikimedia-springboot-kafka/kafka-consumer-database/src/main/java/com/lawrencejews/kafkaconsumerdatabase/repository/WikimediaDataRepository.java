package com.lawrencejews.kafkaconsumerdatabase.repository;

import com.lawrencejews.kafkaconsumerdatabase.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}

package com.projetocorreios.apirest.repository;

import com.projetocorreios.apirest.models.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrackingRepository extends JpaRepository<Tracking, Long> {

    Tracking findById(long trackingCode);

}

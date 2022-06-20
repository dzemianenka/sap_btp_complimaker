package com.dzemianenka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dzemianenka.model.Compliment;

public interface ComplimentRepository extends JpaRepository<Compliment, Long> {
}

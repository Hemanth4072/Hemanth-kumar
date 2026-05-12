package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}

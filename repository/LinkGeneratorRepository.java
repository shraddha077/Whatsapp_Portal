package com.mypromotions.repository;

import com.mypromotions.model.LinkGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkGeneratorRepository extends JpaRepository<LinkGenerator, Long> {
    // Method to retrieve the URL from LinkGenerator
    String getUrl();
}

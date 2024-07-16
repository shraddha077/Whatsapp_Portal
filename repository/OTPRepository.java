package com.mypromotions.repository;

import com.mypromotions.model.OTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OTPRepository extends JpaRepository<OTP, Long> {
    // Add custom query methods if needed
    OTP findByEmail(String email);
}

package com.mypromotions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mypromotions.model.Autoresponder;
import java.util.List;

public interface AutoresponderRepository extends JpaRepository<Autoresponder, Long> {

    List<Autoresponder> findByMessage(String message);
}

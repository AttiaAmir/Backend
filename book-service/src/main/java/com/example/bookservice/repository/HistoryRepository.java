package com.example.bookservice.repository;
import com.example.bookservice.dto.BorrowedBookStat;
import com.example.bookservice.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HistoryRepository extends JpaRepository<History, Long> {
    @Query("SELECT c.date, COUNT(c) FROM History AS c WHERE c.type = :type GROUP BY c.date ORDER BY c.date DESC")
    public List<Object> findAllByType(String type) ;
}

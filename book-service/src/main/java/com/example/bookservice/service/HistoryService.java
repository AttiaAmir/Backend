package com.example.bookservice.service;

import com.example.bookservice.model.History;
import com.example.bookservice.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository ;

    public List<History> getAll() {
        return historyRepository.findAll() ;
    }

    public History create(History book) {
        return historyRepository.save(book) ;
    }

    public Object getBorrowedBookPerDay(){
        return historyRepository.findAllByType("BORROW") ;
    }
}

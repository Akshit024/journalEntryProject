package com.akshit.journalApp.Services;

import com.akshit.journalApp.Model.JournalEntry;
import com.akshit.journalApp.Repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServices {

    @Autowired
    private JournalRepository journalRepository;


    public void saveEntry(JournalEntry journalEntry){
        journalRepository.save(journalEntry);
    }

    public List<JournalEntry> getAllEntry(){
        return journalRepository.findAll();
    }

    public void deleteAll(){
        journalRepository.deleteAll();
    }

}

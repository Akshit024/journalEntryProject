package com.akshit.journalApp.Controller;


import com.akshit.journalApp.Model.JournalEntry;
import com.akshit.journalApp.Services.JournalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalServices journalServices;

    @PostMapping
    public ResponseEntity<?> createJournalEntry(@RequestBody JournalEntry journalEntry){
        journalEntry.setDate(LocalDateTime.now());
        journalServices.saveEntry(journalEntry);
        return new ResponseEntity<>(journalEntry, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllJournalEntries(){
        return new ResponseEntity<>(journalServices.getAllEntry(),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        journalServices.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

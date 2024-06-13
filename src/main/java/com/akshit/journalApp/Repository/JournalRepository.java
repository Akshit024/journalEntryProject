package com.akshit.journalApp.Repository;

import com.akshit.journalApp.Model.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JournalRepository extends MongoRepository<JournalEntry, ObjectId> {

}

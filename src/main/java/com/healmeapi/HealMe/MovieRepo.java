package com.healmeapi.HealMe;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie , ObjectId> { // just like the mysql entity which is the name of entity and the id
    Optional<Movie> findByImdbId(String imdbId);
}

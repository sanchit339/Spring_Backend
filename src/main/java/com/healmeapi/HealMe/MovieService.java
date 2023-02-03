package com.healmeapi.HealMe;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){  // optional is included coz Id should not be null
//        return movieRepo.findById(id);
//    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepo.findByImdbId(imdbId);
    }
}

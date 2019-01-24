package com.stackroute.track.repository;

import com.stackroute.track.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//jpa is having crud menthods...we want to use crud operations pres in JpaRepo(interface)..
@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

}

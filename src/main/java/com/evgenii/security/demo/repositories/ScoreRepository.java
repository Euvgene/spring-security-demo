package com.evgenii.security.demo.repositories;

import com.evgenii.security.demo.entities.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository  extends CrudRepository<Score,Long> {

}

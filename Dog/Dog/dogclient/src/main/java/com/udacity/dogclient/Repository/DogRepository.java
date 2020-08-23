package com.udacity.dogclient.Repository;

import com.udacity.dogclient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}

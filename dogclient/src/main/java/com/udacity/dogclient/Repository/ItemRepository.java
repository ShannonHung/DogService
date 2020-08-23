package com.udacity.dogclient.Repository;


import com.udacity.dogclient.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}

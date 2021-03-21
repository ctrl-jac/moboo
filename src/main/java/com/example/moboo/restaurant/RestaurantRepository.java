package com.example.moboo.restaurant;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<RestaurantEntity,Long> {
    public RestaurantEntity findByName(String name);
    public RestaurantEntity findById(String id);
}

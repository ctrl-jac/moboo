package com.example.moboo.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO){
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setName(restaurantDTO.getName());
        restaurantEntity = restaurantRepository.save(restaurantEntity);
        restaurantDTO.setId(restaurantEntity.getId());
        return restaurantDTO;
    }

    public RestaurantDTO fetchRestaurant(String rId){
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        RestaurantDTO returnDTO = new RestaurantDTO();
        restaurantEntity = restaurantRepository.findById(rId);
        returnDTO.setId(restaurantEntity.getId());
        returnDTO.setName(restaurantEntity.getName());
        return returnDTO;
    }


}

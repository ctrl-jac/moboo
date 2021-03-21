package com.example.moboo.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(name = "create",value = "create")
    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO restaurantDTO)
    {
        restaurantDTO = restaurantService.createRestaurant(restaurantDTO);
        return new ResponseEntity<>(restaurantDTO, HttpStatus.OK);
    }

    @GetMapping(name = "get",value = "fetch/{rid}")
    public ResponseEntity<RestaurantDTO> fetchRestaurant(@PathVariable("rid") String rId)
    {
        RestaurantDTO restaurantDTO = restaurantService.fetchRestaurant(rId);
        return new ResponseEntity<>(restaurantDTO, HttpStatus.OK);
    }

}

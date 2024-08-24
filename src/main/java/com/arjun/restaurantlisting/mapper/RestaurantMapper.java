package com.arjun.restaurantlisting.mapper;


import org.mapstruct.Mapper;

import com.arjun.restaurantlisting.dto.RestaurantDTO;
import com.arjun.restaurantlisting.entity.Restaurant;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}

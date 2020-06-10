package com.example.Mapper;

import com.example.Entity.Airport;
import com.example.Model.AirportDTO;

@Mapper(componentModel = "spring" , uses = {FlightDetailsMapper.class})
public interface airportMapper extends EntiryMapper<AirportDTO , Airport>{
	

}

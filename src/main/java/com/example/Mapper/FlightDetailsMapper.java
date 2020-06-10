package com.example.Mapper;

import com.example.Entity.FlightDetails;
import com.example.Model.FlightDetailsDTO;

@Mapper(componentModel = "spring" , uses = {})
public interface FlightDetailsMapper extends EntiryMapper<FlightDetailsDTO , FlightDetails>{

}

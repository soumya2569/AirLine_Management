package Mapper;

import Entity.Airport;
import Model.AirportDTO;

@Mapper(componentModel = "spring" , uses = {FlightDetailsMapper.class})
public interface airportMapper extends EntiryMapper<AirportDTO , Airport>{
	

}

package Mapper;

import Entity.FlightDetails;
import Model.FlightDetailsDTO;

@Mapper(componentModel = "spring" , uses = {})
public interface FlightDetailsMapper extends EntiryMapper<FlightDetailsDTO , FlightDetails>{

}

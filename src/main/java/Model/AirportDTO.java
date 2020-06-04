package Model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



public @Data class  AirportDTO {
	String airportName;	
	String airportAddress;
	String airportCode;
	List<FlightDetailsDTO> flightScheduleList;
	
	
	
}

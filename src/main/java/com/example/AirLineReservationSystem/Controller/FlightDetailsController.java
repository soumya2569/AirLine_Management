package com.example.AirLineReservationSystem.Controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.FlightDetailsDTO;
import com.example.Service.ServiceToAllFlight;

@RestController
@CrossOrigin
@RequestMapping(value="/base")
public class FlightDetailsController {
	
	
	private final ServiceToAllFlight flightService; 
	
	
	
	public FlightDetailsController(ServiceToAllFlight flightService) {
		
		this.flightService = flightService;
	}



	@GetMapping(value="/getFlight")
	
	public List<FlightDetailsDTO> getFlightDetails() {

		return 	flightService.showAllFlight();

	}
	
	@GetMapping(value="/getFlightStatus")
	public List<FlightDetailsDTO> showFlightStatus() {

		List<FlightDetailsDTO> flightStatus =  flightService.showAllFlight();
		
		
		return flightStatus.stream().filter(stat -> !stat.toString().equalsIgnoreCase("CANC")).collect(Collectors.toList());

	}
	
	@GetMapping(value="/getFlight/{flightNo} ")
	public FlightDetailsDTO showSeatDetail(@PathVariable int flightNo) {
		
		List<FlightDetailsDTO> flightStatus =  flightService.showAllFlight();
		
		return flightStatus.stream().filter(p -> flightNo == p.getFlightNo()).findFirst().orElse(null);	
		
	
	}

	
	
	
	
	
	

}

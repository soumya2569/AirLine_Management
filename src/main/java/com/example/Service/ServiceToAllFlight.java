package com.example.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.example.Mapper.FlightDetailsMapper;
import com.example.Model.FlightDetailsDTO;
import com.example.Repository.DaoRepoFlightDetails;

@Service
public class ServiceToAllFlight {
	
	
	private final DaoRepoFlightDetails flightRepo ;
	
	
	private final FlightDetailsMapper mapper ;
		
	
	public ServiceToAllFlight(DaoRepoFlightDetails flightrepo , FlightDetailsMapper mapper) {
		super();
		this.flightRepo = flightrepo;
		this.mapper = mapper;
	}

/**
 * This will show All Flight Detail
 * @return
 */
	public List<FlightDetailsDTO> showAllFlight() {
		
		
		Order order =  new Order(Direction.ASC, "price");
		
		List<Order>  orders =  new ArrayList<Order>();
		orders.add(order);
				
		List<FlightDetailsDTO> flightDetails = mapper.convertToDTO(flightRepo.findAll(Sort.by(orders)));
		
			
		return flightDetails;
	}
	
	

}

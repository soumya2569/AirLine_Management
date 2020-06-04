package Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import Entity.FlightDetails;
import Mapper.FlightDetailsMapper;
import Model.FlightDetailsDTO;
import Repository.DaoRepoFlightDetails;

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

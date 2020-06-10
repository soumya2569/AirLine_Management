package com.example.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "airport_detail")
public class  Airport {
	
	
	long id; 
	
	String airportName;	
	String airportAddress;
	String airportCode;
	List<FlightDetails> flightSchedule;
	
	
	
	public Airport(long id, String airportName, String airportAddress, String airportCode,
			List<FlightDetails> flightSchedule) {
		super();
		this.id = id;
		this.airportName = airportName;
		this.airportAddress = airportAddress;
		this.airportCode = airportCode;
		this.flightSchedule = flightSchedule;
	}

	public Airport() {
		
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "Id" , unique = true , nullable = false)
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column (name = "airport_name")
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Column (name = "airport_add")
	public String getAirportAddress() {
		return airportAddress;
	}
	public void setAirportAddress(String airportAddress) {
		this.airportAddress = airportAddress;
	}
	@Column (name = "airport_code")
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "flightSchedule")
	public List<FlightDetails> getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(List<FlightDetails> flightSchedule) {
		this.flightSchedule = flightSchedule;
	}
	
	
	
	
	
	
}

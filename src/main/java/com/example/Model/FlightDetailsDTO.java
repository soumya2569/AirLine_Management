package com.example.Model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



public @Data class  FlightDetailsDTO {

	int flightNo;
	String airline;
	double durationInMin;
	String source;
	String destination;
	SeatDTO seatNo ;

	Date dateTime;
	String status;
	String gate;
	
}

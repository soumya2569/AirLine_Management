package Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class  FlightDetails {

	
	int flightid;
	String airline;
	double durationInMin;
	Date flightTime;
	int price;
	String source;
	String destination;
	Seat seatNo ;
	
	Date dateTime;
	String status;
	String gate;
	
	
	

	
	public FlightDetails(int flightid, String airline, double durationInMin, Date flightTime, int price, String source,
			String destination, Seat seatNo, Date dateTime, String status, String gate) {
		super();
		this.flightid = flightid;
		this.airline = airline;
		this.durationInMin = durationInMin;
		this.flightTime = flightTime;
		this.price = price;
		this.source = source;
		this.destination = destination;
		this.seatNo = seatNo;
		this.dateTime = dateTime;
		this.status = status;
		this.gate = gate;
	}

	public FlightDetails() {
		
	}
	@Column (name = "flight_Time")
	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "Id" , unique = true , nullable = false)
	
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	@Column (name = "airline")
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	@Column (name = "duration")
	public double getDurationInMin() {
		return durationInMin;
	}
	public void setDurationInMin(double durationInMin) {
		this.durationInMin = durationInMin;
	}
	@Column (name = "source")
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Column (name = "destination")
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Column (name = "seat")
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "seat")
	public Seat getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Seat seatNo) {
		this.seatNo = seatNo;
	}
	@Column (name = "Date")
	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column (name = "Flight_Status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Column (name = "gateNo")
	public String getGate() {
		return gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}

	public int getPrice() {
		return price;
	}

	@Column (name = "Ticket_Price")
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}

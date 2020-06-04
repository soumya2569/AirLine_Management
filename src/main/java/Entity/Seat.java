package Entity;

public class Seat {

	String seatNo;
	String seatPosition;
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getSeatPosition() {
		return seatPosition;
	}
	public void setSeatPosition(String seatPosition) {
		this.seatPosition = seatPosition;
	}
	public Seat(String seatNo, String seatPosition) {
		super();
		this.seatNo = seatNo;
		this.seatPosition = seatPosition;
	}
	
}

package java2;

public class Seat {
	private int seatNumber;
	private String passengerName;
	
	
	public Seat(int seatNumber) {
		this.seatNumber = seatNumber;
		this.passengerName = null;
	}

	public Seat() {
		
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public boolean isEmpty() {
		return passengerName == null;
	}
	
	public String toString() {
		return "Seat "+seatNumber+"is Empty "+isEmpty() +" ,Seat name "+passengerName+ " ,Row "+getRow(seatNumber)+" ,Column "+getColumn(seatNumber);
	}
	
	public static boolean isValid(int seatNumber) {
		if(seatNumber >= 1 && seatNumber <= 92 && 
				(seatNumber != 3 && seatNumber != 4 && seatNumber != 89 && seatNumber != 90)) {
			return true;
		}
		return false;
	}
	
	public static int getRow(int seatNumber) {
		if(!isValid(seatNumber)) {
			return -1;
		}
		return (seatNumber - 1) / 4 + 1;
	}
	
	public static int getColumn(int seatNumber) {
		if(!isValid(seatNumber)) {
			return -1;
		}
		return (seatNumber - 1) % 4 + 1;
	}
	
}

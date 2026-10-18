package java2;

public class Train {
	private static Seat[][] seats= new Seat[23][];
	
	public Train() {
		for(int i = 0; i < seats.length;i++) {
			if(i == 0 || i == 22) {
			seats[i] = new Seat[4];
			}else {
				seats[i] = new Seat[4];
			}
		}for (int i = 1; i < 92; i++) {
			if(Seat.isValid(i)) {
				seats[Seat.getRow(i) - 1][Seat.getColumn(i) - 1] = new Seat(i);
			}
		}
	}
	
	public boolean reserveSeat(int seatNumber, String passengerName) {
		if(!Seat.isValid(seatNumber)) {
			return false;
		}
		Seat seat1 = seats[Seat.getRow(seatNumber) - 1][Seat.getColumn(seatNumber) - 1];
		if(seat1.isEmpty()) {
			seat1.setPassengerName(passengerName);
			return true;
		}
		return false;
	}
}

package java2;

public class Main {

	public static void main(String[] args) {
		Train s1 = new Train();
		System.out.println("11 is Valid "+Seat.isValid(11));
		System.out.println("3 is Valid "+Seat.isValid(4));
		System.out.println(s1.reserveSeat(5, "badi"));
		System.out.println("colum "+Seat.getColumn(11));
		System.out.println("colum "+Seat.getRow(93));
	}

}

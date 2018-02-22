package ua.lviv.iot;

public class Main {

	public static void main(String[] args) {
		Ship оxford = new Ship();
		Ship titanic = new Ship(42, 70, false, "Titanic");
		Ship northKorea = new Ship(69, 200, true, "Death to USA", "Kim Jong-il");
		
		System.out.println(оxford.toString());
		System.out.println(titanic.toString());
		System.out.println(northKorea.toString());
		
		Ship.printStaticSum();
		оxford.printSum();
		titanic.printSum();
		northKorea.printSum();
		
		оxford.resetValues(80, 90, false, "Oxford 2.0", "Pedro Francesco");
		titanic.resetValues(200, 73, true, "IOT", "Zenoviy Veres");
		northKorea.resetValues(70, 190, true, "Tsar-bomb", "Kim Jong-un");
		
		System.out.println(оxford.toString());
		System.out.println(titanic.toString());
		System.out.println(northKorea.toString());
		Ship.printStaticSum();
	}

}

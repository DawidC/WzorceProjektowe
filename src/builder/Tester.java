package builder;

public class Tester {

	public static void main(String[] args) {
		Car AudiA3 = new Car.Builder()
				.make("Audi")
				.model("A3")
				.color("red")
				.yearOfProduction(2010)
				.build();
		
		System.out.println(AudiA3);
	}

}

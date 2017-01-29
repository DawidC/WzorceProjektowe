package builder.classic;

import builder.classic.entities.Car;

public class Client {
	public static void main(String[] args){
		CarBuilder carBuilder = new RaceCarBuilder();
		CarDirector carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		
		Car car = carDirector.getCar();
		carBuilder = new BMWCarBuilder();
		carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		Car car2 = carDirector.getCar();
		System.out.println(car);
		System.out.println(car2);
		
	}
}

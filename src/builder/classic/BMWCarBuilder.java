package builder.classic;

import builder.classic.entities.Car;
import builder.classic.entities.Engine;
import builder.classic.entities.Tires;

public class BMWCarBuilder implements CarBuilder {
	private Car car;
	
	public BMWCarBuilder(){
		this.car = new Car();
		this.car.setMake("BMW");
		this.car.setModel("i5");
	}
	
	@Override
	public void buildTires() {
		// TODO Auto-generated method stub
		Tires tires = new Tires();
		tires.setDurability(80);
		tires.setType("Standard");
		
		car.setTires(tires);
	}

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		engine.setType("v12");
		
		car.setEngine(engine);
	}

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return car;
	}

}

package builder.classic;

import builder.classic.entities.Car;
import builder.classic.entities.Engine;
import builder.classic.entities.Tires;

public class RaceCarBuilder implements CarBuilder {
	private Car car;
	
	public RaceCarBuilder(){
		this.car = new Car();
		this.car.setMake("Race");
		this.car.setModel("Car");
	}
	
	@Override
	public void buildTires() {
		// TODO Auto-generated method stub
		Tires tire = new Tires();
		tire.setDurability(50);
		tire.setType("Slicks");
		
		car.setTires(tire);
	}

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		engine.setType("v8");
		car.setEngine(engine);
	}

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return car;
	}

}

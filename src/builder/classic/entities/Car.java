package builder.classic.entities;

public class Car {

	private Tires tires;
	private Engine engine;
	private String make;
	private String model;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Tires getTires() {
		return tires;
	}
	public void setTires(Tires tires) {
		this.tires = tires;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [tires=" + tires + ", engine=" + engine + ", make=" + make + ", model=" + model + "]";
	}
	
}

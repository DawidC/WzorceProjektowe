package builder;

public class Car {
	private String make;
	

	private String model;
	private String color;
	private int yearOfProduction;
	
	private Car(Builder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.color = builder.color;
		this.yearOfProduction = builder.yearOfProduction;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public static class Builder{
		private String make;
		private String model;
		private String color;
		private int yearOfProduction;
		
		public Builder(){
			
		}
		
		public Builder color(String color){
			this.color = color;
			return this;
		}
		
		public Builder make(String make){
			this.make = make;
			return this;
		}
		
		public Builder model(String model){
			this.model = model;
			return this;
		}
		
		public Builder yearOfProduction(int yearOfProduction){
			this.yearOfProduction = yearOfProduction;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", yearOfProduction=" + yearOfProduction
				+ "]";
	}
}

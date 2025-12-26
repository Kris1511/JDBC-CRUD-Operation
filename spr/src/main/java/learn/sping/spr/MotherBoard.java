package learn.sping.spr;

public class MotherBoard {
	
	String model;
	String brand;
	String os;
	public MotherBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MotherBoard(String model, String brand, String os) {
		super();
		this.model = model;
		this.brand = brand;
		this.os = os;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public String toString() {
		return "MotherBoard [model=" + model + ", brand=" + brand + ", os=" + os + "]";
	}
}

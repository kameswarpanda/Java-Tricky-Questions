package Inheritance;

class Camera {
	private String brand;
	private int cost;

	Camera() {
		this.brand = "Nikon";
	}

	Camera(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
}

public class DigitalCamera extends Camera {
	private int memory;

	DigitalCamera(String brand, int cost) {
		this.memory = 16;
	}

	public static void main(String[] args) {
		DigitalCamera Camera = new DigitalCamera("Canon", 100);
    
	}
}
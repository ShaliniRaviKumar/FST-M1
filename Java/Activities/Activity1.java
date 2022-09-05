package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.make = 2014;
		obj.color = "Black";
		obj.transmission = "Manual";
    
        
		obj.displayCharacterstics();
		obj.accelerate();
		obj.brake();
	}

}

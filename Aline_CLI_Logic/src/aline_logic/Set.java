package aline_logic;

public class Set {
	
	private int serial_number;
	private float weight;
	private int repetitions;
	
	public Set(int serial_number, float weight, int repetitions) {
		this.serial_number = serial_number;
		this.weight = weight;
		this.repetitions = repetitions;
	}
	
	@Override 
	public String toString() {
		return "Set: " + serial_number + " | weight: " + weight + "lbs | repititions: " + repetitions;
	}

}

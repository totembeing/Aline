package aline_logic;

public class Main {
	
	public static void main(String[] args) {
		
		//Creating work_out session object and exercise object
		WorkoutSession pushDay = new WorkoutSession("Push Day");
		Exercise inclinedDumbbellPress = new Exercise("Inclined Dumbbell Press");
		
		//adding this exercise to the pushDay object
		pushDay.addExercise(inclinedDumbbellPress);
		
		//creating set objects
		Set set1 = new Set(1, 50, 8);
		Set set2 = new Set(2, 50, 8);
		
		//adding the sets to exercise list
		inclinedDumbbellPress.addSet(set1);
		inclinedDumbbellPress.addSet(set2);
		
		System.out.println(pushDay.toString());
		//WorkoutSession.toString() -> calls Exercise.toString() -> calls SettoString()
		//This is a recursive structure where I am printing the entire object tree
	}

}

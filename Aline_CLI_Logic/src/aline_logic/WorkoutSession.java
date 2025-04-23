package aline_logic;

import java.util.ArrayList;
import java.util.List;

public class WorkoutSession {
	
	private String session;
	private List<Exercise> exercises = new ArrayList<>();
	
	//We are not putting exercises in the constructor because the object will have only one property at the time
	//of creation, which is session. The exercises are added later 
	public WorkoutSession(String session) {
		this.session = session;
	}

	//You do not create an exercise object inside this function, instead you add an already created exercise 
	//object outside this function (in other class) and add it to the list
	public void addExercise(Exercise exercise) {
		exercises.add(exercise);
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder(session + "\n");
		for (Exercise e : exercises) {
			sb.append(" ").append(e.toString()).append("\n");
		}
		return sb.toString();
		
	}
 	
}

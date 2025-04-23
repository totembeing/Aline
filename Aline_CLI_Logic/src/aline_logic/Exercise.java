package aline_logic;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
	
	private String name;
	//declaring the sets variable as a List interface and initializing it as an ArrayList
	private List<Set> sets = new ArrayList<>();

	
	//List = general behavior
	//ArrayList, LinkedList, etc. = specific behavior
	
	//Programming to an interface means when possible, one should refer to a more abstract level of a class, 
	//instead of referring to a concrete implementation
	
	public Exercise(String name) {
		this.name = name;
	}
	
	public void addSet(Set set) {
		sets.add(set);
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder(name + "\n");
		for (Set s: sets) {
			sb.append("  ").append(s.toString()).append("\n");
		}
		return sb.toString();
	}
}

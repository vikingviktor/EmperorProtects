import java.util.*;

public class SquadManager {
	
	private List<SpaceMarine> marines;
	
	public static int maxMarines = 10;
	public static int captains = 0;
	
	public static void NumCaps() {
		System.out.println("There are: " + captains + "captains who manage squads");
	}
	
	public SquadManager() {
		marines = new ArrayList<SpaceMarine>();
	}
	
	public void setMarines(List<SpaceMarine>marines) {
		this.marines = marines;
	}
	
	public void addMarine(SpaceMarine marine) {
		if (marines.size() < SquadManager.maxMarines)
			marines.add(marine);
		
		marines.isEmpty();
	}
	
	public void showMarines() {
		for (SpaceMarine e : marines) {
			System.out.println(e.getName());
		}
	}

}

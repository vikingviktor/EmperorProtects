
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		GreyKnight Epimetheus = new GreyKnight();
		Epimetheus.setName("Epimetheus");
		Epimetheus.setWorld("Titan");
		Epimetheus.setAttack(7);
		Epimetheus.setDefence(6);
		Epimetheus.setSquad("Unknown");
		
		GreyKnight Vitus = new GreyKnight();
		Vitus.setName("Vitus");
		Vitus.setWorld("Titan");
		Vitus.setAttack(4);
		Vitus.setDefence(5);
		Vitus.setSquad("HellPurgers");
		
		System.out.println("Vitus attacks with a:");
		Vitus.strongAttack();
		System.out.println("\nEpimetheus attacks with a:");
		Epimetheus.lightAttack();
		
		
		System.out.println("\nMembers of the actual squad: ");
		SquadManager Phineas = new SquadManager();
		Phineas.addMarine(Vitus);
		Phineas.showMarines();
		

	}

}

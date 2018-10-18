
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
		
		GreyKnight Andreus = new GreyKnight();
		Andreus.setName("Andreus");
		Andreus.setWorld("Titan");
		Andreus.setAttack(3);
		Andreus.setDefence(6);
		Andreus.setSquad("HellPurgers");
		
		ThousandSon Ahriman = new ThousandSon();
		Ahriman.setName("Ahriman");
		Ahriman.setWorld("Prospero");
		Ahriman.setAttack(6);
		Ahriman.setDefence(4);
		Ahriman.setSquad("ScarabCircle");
		
		System.out.println("Vitus attacks with a:");
		Vitus.strongAttack();
		System.out.println("\nEpimetheus attacks with a:");
		Epimetheus.lightAttack();
		
		
		System.out.println("\nMembers of the GreyKnight squad: ");
		SquadManager Phineas = new SquadManager();
		Phineas.addMarine(Vitus);
		Phineas.addMarine(Andreus);
		Phineas.showMarines();
		
		System.out.println("\nMembers of the ThousandSon squad: ");
		SquadManager Magnus = new SquadManager();
		Magnus.addMarine(Ahriman);
		Magnus.showMarines();
		

	}

}

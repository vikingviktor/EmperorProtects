
public class BloodAngel extends SpaceMarine implements LightAttack, StrongAttack{

	@Override
	public void strongAttack() {
		System.out.println("Surprise Ambush");
		
	}

	@Override
	public void lightAttack() {
		System.out.println("SawSword Attack");
		
	}

	@Override
	public void adorarCaos() throws Exception {
		throw new Exception ("Purge the traitors");
		
	}

}

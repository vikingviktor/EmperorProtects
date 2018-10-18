
public class Ultramarine extends SpaceMarine implements LightAttack, StrongAttack{

	@Override
	public void strongAttack() {
		System.out.println("PowerSword Attack");
		
	}

	@Override
	public void lightAttack() {
		System.out.println("Fire Bolter");
		
	}

	@Override
	public void adorarCaos() throws Exception {
		throw new Exception ("Purge the traitors");
		
	}

}

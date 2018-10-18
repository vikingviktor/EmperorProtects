
public class ImperialFist extends SpaceMarine implements LightAttack, StrongAttack{

	@Override
	public void strongAttack() {
		System.out.println("Flamethrower Attack");
		
	}

	@Override
	public void lightAttack() {
		System.out.println("Bolter Fire");
		
	}

	@Override
	public void adorarCaos() throws Exception {
		throw new Exception ("Purge the traitors");
		
	}

}

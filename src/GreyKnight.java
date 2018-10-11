
public class GreyKnight extends SpaceMarine implements LightAttack, StrongAttack{
	
	public GreyKnight() {
		
	}

	@Override
	public void strongAttack() {
		System.out.println("Psiquic Attack");
		
	}

	@Override
	public void lightAttack() {
		System.out.println("PowerSpear Attack");
		
	}

	@Override
	public void adorarCaos() throws Exception {
		throw new Exception ("Purge the traitors");
		
	}
	
	

}

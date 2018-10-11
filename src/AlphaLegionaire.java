
public class AlphaLegionaire extends SpaceMarine implements LightAttack, StrongAttack{
	
	public AlphaLegionaire() {
		
	}

	@Override
	public void strongAttack() {
		System.out.println("Backstab Attack");
		
	}

	@Override
	public void lightAttack() {
		System.out.println("Psiquic Attack");
		
	}

	@Override
	public void adorarCaos() {
		System.out.println("Doing typical heretic stuff");
		
	}

}

package defaultMethod;

public class DefaultMEthod implements PersonaA, PersonaB{

	public static void main(String[] args) {
		
		DefaultMEthod app = new DefaultMEthod();
		
		app.hablar();
			
	}

	@Override
	public void caminar() {
		System.out.println("Hola Mundo!");
	}

	@Override
	public void hablar() {
		PersonaB.super.hablar();
	}

}

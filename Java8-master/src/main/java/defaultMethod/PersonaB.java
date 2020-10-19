package defaultMethod;

public interface PersonaB {
	
	default public void hablar(){
		System.out.println("Soy la persona B");
	}

}

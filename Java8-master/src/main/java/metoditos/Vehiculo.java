package metoditos;

public class Vehiculo {
	
	private final int tanqueLleno;
	private int combustibleActual;
	
	public Vehiculo(final int tanqueLleno) {
		this.tanqueLleno = tanqueLleno;
		combustibleActual = tanqueLleno;
	}
	
	public void tanquearVehiculo(int combustible) {
		if(combustible <=0) {
			System.out.println("Debe agregar más de 0 ml de combustible");
			return;
		}
		if((combustible > tanqueLleno) || (combustible > (tanqueLleno - combustibleActual))) {
			combustibleActual += combustible;
		}
	}
	
	public int getCombustibleActual() {
		return combustibleActual;
	}
	
	public int getTanqueLleno() {
		return tanqueLleno;
	}
	
	public void accelerar() {
		combustibleActual--;
	}
	
}


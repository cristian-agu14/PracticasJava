package com.mitocode.finterface;

public class FuntionalInterfaceApp {

	public static void main(String[] args) {
		FuntionalInterfaceApp app= new FuntionalInterfaceApp();
		double rpta = app.operar(5, 8);

	}
	
	public double operar(double x, double y){
		Operacion op = (n1, n2) -> n1 + n2;
		return op.calcular(x, y);
	}

}

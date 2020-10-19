package com.mitocode.java8.lambda;

public class Sintaxis {

	public static void main(String[] args) {
		
		Sintaxis app = new Sintaxis();
		
		System.out.println(app.probarSintaxis());
	}
	
	
	public double probarSintaxis(){
	
		//Operacion operacion = (double num1, double num2) -> (num1 + num2)/2;
		
		//otra manera
		Operacion operacion = (double num1, double num2) -> {return(num1 + num2)/2;};
		return operacion.calcularPromedio(2, 4);
		
	}

}

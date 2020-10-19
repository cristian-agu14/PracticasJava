package com.mitocode.streams;

import java.util.ArrayList;
import java.util.List;
/**
 * Se usa esto bajo el enfoque declarativo
 * @author Cristian
 *
 */
public class StreamApp {
	
	private List<String> lista;
	private List<String> numeros;


	public static void main(String[] args) {
		
		StreamApp app = new StreamApp();
		app.filtrar();
		System.out.println("==========Ordenamiento===============");
		app.ordenar();
		System.out.println("=============Transformar===============");
		app.transformar();
		System.out.println("===============Limitar=================");
		app.limitar();
		System.out.println("==============Contar==================");
		app.contar();

	}
	
	public StreamApp(){
		lista = new ArrayList<>();
		lista.add("Cristian");
		lista.add("Agudelo");
		lista.add("Hoyos");
		lista.add("Monica");
		lista.add("Hurtado");
		lista.add("Cespedes");
		
		numeros = new ArrayList<>();
		numeros.add("8");
		numeros.add("85");
		numeros.add("5");
		numeros.add("1");
		numeros.add("33");
		
	}
	
	public void filtrar(){
		lista.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
	}
	
	public void ordenar(){
		lista.stream().sorted().forEach(System.out::println);//Orden descendente
		//lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);//Orden ascendente
		
	}
	
	public void transformar(){
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
		/*Manera imperativa
		for(String elem: numeros){
			int num = Integer.parseInt(elem)+1;
			System.out.println(num);
			
		}*/
		numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);
		
	}
	
	public void limitar(){
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar(){
		Long x =lista.stream().count();
		System.out.println(x);
	}
	

}

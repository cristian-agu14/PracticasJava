package com.mitocode.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AppMap {

	private Map<Integer, String> map;

	public static void main(String[] args) {

		AppMap appMap = new AppMap();

		appMap.poblar();
		// System.out.println("Impresion des de la versión 7");
		// appMap.imprimirVer7();
		// System.out.println("Impresion des de la versión 8");
		// appMap.imprimirVer8();
		System.out.println("=========Insertar si es ausente============");
		appMap.insertarSiAusente();
		appMap.imprimirVer8();
		System.out.println("=========obtenerOrPredeterminado===========");
		appMap.obtenerOrPredeterminado();

	}

	public void poblar() {

		map = new HashMap<>();
		map.put(1, "Cristian");
		map.put(2, "Real Madrid");
		map.put(5, "Monica");
		map.put(4, "Prueba");

	}

	public void imprimirVer7() {
		for (java.util.Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Llave: " + e.getKey() + "Valor: " + e.getValue());

		}
	}

	public void imprimirVer8() {
		map.forEach((k, v) -> System.out.println("Llave: " + k + "Valor: " + v));
		// map.entrySet().stream().forEach(System.out::println);
	}

	public void recolectar() {
		Map<Integer, String>  mapaRecolectado = map.entrySet().stream().filter(e -> e.getValue().contains("Cris")).collect(Collectors.toMap(p -> p. , valueMapper));

	}

	public void insertarSiAusente() {
		map.putIfAbsent(4, "Cristian");
		map.putIfAbsent(8, "Cristian 8");

	}

	public void recolectarSiAusente() {

	}

	public void operarSiPresente() {

	}

	public void obtenerOrPredeterminado() {
		System.out.println(map.getOrDefault(42, "Valor por defecto"));
	}

}

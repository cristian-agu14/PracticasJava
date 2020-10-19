package com.mitocode.localdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class App {

	public static void main(String[] args) throws InterruptedException, ParseException {

		App app = new App();

		app.verificar(8);
		app.medirTiempo(8);
		app.periodoEntreFechas(8);
		app.convertir(8);
	}

	public void verificar(int version) {
		if (version == 7) {
			Calendar fecha1 = Calendar.getInstance();
			Calendar fecha2 = Calendar.getInstance();

			fecha1.set(1991, 0, 13);
			System.out.println(fecha1.after(fecha2));

		} else if (version == 8) {
			LocalDate fecha1 = LocalDate.of(1991, 01, 13);
			LocalDate fecha2 = LocalDate.now();

			System.out.println("La fecha esta despues de hoy? " + fecha1.isAfter(fecha2));
			System.out.println("La fecha esta antes de ahora? " + fecha1.isBefore(fecha2));

			LocalTime time1 = LocalTime.of(15, 00, 00);
			LocalTime time2 = LocalTime.now();

			System.out.println("La hora esta despues de ahora? " + time1.isAfter(time2));
			System.out.println("La hora esta antes de ahora? " + time1.isBefore(time2));

			LocalDateTime fechaTiempo1 = LocalDateTime.of(1991, 01, 13, 15, 00, 00);
			LocalDateTime fechaTiempo2 = LocalDateTime.now();

			System.out.println(
					"Con fecha y hora: La fecha y hora esta despues de ahora? " + fechaTiempo1.isAfter(fechaTiempo2));
			System.out.println(
					"Con fecha y hora: La fecha y hora esta antes de ahora? " + fechaTiempo1.isBefore(fechaTiempo2));

		}

	}

	public void medirTiempo(int version) throws InterruptedException {
		if (version == 7) {
			long inicio = System.currentTimeMillis();
			Thread.sleep(1000);
			long fin = System.currentTimeMillis();

			System.out.println("El tiempo es: " + (fin - inicio));
		} else if (version == 8) {
			Instant inicio = Instant.now();
			Thread.sleep(1000);
			Instant fin = Instant.now();

			System.out.println("El tiempo es: " + Duration.between(inicio, fin));
			System.out.println("Convertido a milisegundos: " + Duration.between(inicio, fin).toMillis());
			System.out.println("Convertido a dias: " + Duration.between(inicio, fin).toDays());
			System.out.println("Convertido a horas: " + Duration.between(inicio, fin).toHours());
			System.out.println("Convertido a milisegundos: " + Duration.between(inicio, fin).toMinutes());

		}
	}

	public void periodoEntreFechas(int version) {
		if (version == 7) {
			Calendar nacimiento = Calendar.getInstance();
			Calendar hoy = Calendar.getInstance();

			nacimiento.set(1990, 10, 05);
			hoy.set(2019, 02, 28);

			int anios = 0;

			while (nacimiento.before(hoy)) {
				nacimiento.add(Calendar.YEAR, 1);
				if (nacimiento.before(hoy)) {
					anios++;
				}
			}
			System.out.println("Tiene una edad de:" + anios + " años");
		} else if (version == 8) {
			LocalDate nacimiento = LocalDate.of(1990, 10, 05);
			LocalDate hoy = LocalDate.now();

			Period periodo = Period.between(nacimiento, hoy);

			System.out.println("Han ranscurrido " + periodo.getYears() + " años, " + periodo.getMonths() + " Meses y "
					+ periodo.getDays() + " dias");

		}
	}

	public void convertir(int version) throws ParseException {
		if (version == 7) {
			String fecha = "21/01/1991";
			DateFormat formateadorFecha = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaConvertida = formateadorFecha.parse(fecha);
			System.out.println("Fecha convertida: " + fechaConvertida);
			
			Date fechaActual= Calendar.getInstance().getTime();
			formateadorFecha = new SimpleDateFormat("dd/MM/yyyy HH::mm:ss a");
			String fechaCadena = formateadorFecha.format(fechaActual);
			System.out.println("Fecha con hora convertida: "+ fechaCadena);
		}else if (version==8) {
			String fecha = "14/03/1991";
			DateTimeFormatter formateadorLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaLocal = LocalDate.parse(fecha, formateadorLocal);
			System.out.println("Fecha convertida con LocalDate: " + fechaLocal);
			System.out.println(formateadorLocal.format(fechaLocal));
		}
	
		
	}

}

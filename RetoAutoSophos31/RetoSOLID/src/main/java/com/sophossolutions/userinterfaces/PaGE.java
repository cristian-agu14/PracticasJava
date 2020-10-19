package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.wong.pe/")
public class PaGE extends PageObject {

	// public static final Target A =
	// Target.the("").locatedBy("id:onesignal-popover-cancel-button");
	public static final Target POPER_NO_GRACIAS = Target.the("Boton no del pop up notificaciones")
			.located(By.id("onesignal-slidedown-cancel-button"));
	public static final Target B = Target.the("").locatedBy("");
	public static final Target C = Target.the("").locatedBy("(//div[@class='categsTop__item'])[6]");
	public static final Target D = Target.the("Input para buscar productos")
			.located(By.id("search-autocomplete-input"));
	public static final Target E = Target.the("").located(By.xpath("//a[contains(text(), '%s')]"));

}

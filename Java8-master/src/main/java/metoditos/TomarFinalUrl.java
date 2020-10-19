package metoditos;

public class TomarFinalUrl {

	public static void main(String[] args) {
		// WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
		// String urlActual = driver.getCurrentUrl();

		String url = "https://prusitios.tuya.com.co/frontgeneral/tus-datos-basicos/error/3/208";
		String d = "";
		int tamanioUrl = url.length() - 1;

		for (int i = 0; i < 11; i++) {
			d = url.charAt(tamanioUrl) + d;
			tamanioUrl--;
		}
		System.out.println(d);
		
	}

}

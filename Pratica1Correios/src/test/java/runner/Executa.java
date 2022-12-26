package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador(boolean headless) {

		String ambiente = "https://www.correios.com.br/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		if (!headless) {
			chromeOptions.addArguments("--headless");
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);

	}
	
	public static void fecharNavegador() {
		driver.quit();
	}

}

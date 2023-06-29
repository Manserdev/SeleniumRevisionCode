package au.com.ncs.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlanetPage {
    private final WebDriver driver;

    public PlanetPage(WebDriver driver) {
        this.driver = driver;
    }

    public Planet getPlanet(String planetName) {

        for(WebElement planetElement: driver.findElements(By.className("planet"))) {
            var planet = new Planet(planetElement);

            if (planet.getName().equalsIgnoreCase(planetName)) {
            }

        }

        throw new NotFoundException();

    }


    public void popUpMessage() {
        By popupMsg = By.id(driver.findElement(By.className("popup")).getText());

    }
}

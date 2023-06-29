package au.com.ncs;

import au.com.ncs.model.Planet;
import au.com.ncs.model.Toolbar;
import au.com.ncs.model.PlanetPage;
import au.com.ncs.strategies.MatchingStrategyName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlanetsTests {

    public WebDriver driver = GetWebDriver();


    @BeforeEach
    public void Setup() {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
        driver.manage().window().maximize();
    }


    @Test
    public void ExploreEarthTest() {

        new Toolbar(driver).click();
        new PlanetPage(driver).getPlanet("earth").clickExplore();
        new PlanetPage(driver).popUpMessage();

    }


    @AfterEach
    public void Clean() {
        driver.quit();
    }


    public WebDriver GetWebDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }

}

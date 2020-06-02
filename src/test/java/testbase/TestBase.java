package testbase;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class TestBase {
    public static WebDriver driver;
    public static ElementsHelper elementsHelper;
    public String testUrl = ("https://www.youtube.com/");

    @BeforeGroups(groups="test_base")
    @Parameters("browser")
    public void setUp (Browsers browser){
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case OPERA:
                OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
                driver = new OperaDriver();
                break;
            case EDGE:
                EdgeDriverManager.getInstance(DriverManagerType.EDGE).setup();
                driver = new EdgeDriver();
                break;
            case IE11:
                InternetExplorerDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new RuntimeException("Invalid specified browser:" + browser + ",expected one of 'CHROME', 'FIREFOX', 'OPERA', 'EDGE', 'IE11'");
        }
        elementsHelper = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    @AfterGroups(groups="test_base")
    public void quit() {
        driver.quit();
    }
}

package ReuseLib;

import POM.NewSignupPOM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {
    public static NewSignupPOM newSignupPOM;
    public static WebDriver driver;

    public static WebDriver Driverint() throws IOException {


        Properties pro=new Properties();
        InputStream input= new FileInputStream("C:\\Users\\2017\\IdeaProjects\\ZOHO_Cucumber_1\\src\\test\\java\\Resources\\config.properties");
        pro.load(input);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String browser = pro.getProperty("Browser");
        driver.get(pro.getProperty("URL"));


        newSignupPOM = new NewSignupPOM(driver);
        return driver;

    }
}

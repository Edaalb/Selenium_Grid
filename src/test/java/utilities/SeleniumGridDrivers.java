package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class SeleniumGridDrivers {
    static WebDriver driver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static WebDriver remoteDriverChromeOptions() {
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new ChromeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("Chrome Driver couldn't find " + e.getMessage());
        }
        return driver;
    }

    public static WebDriver remoteDriverFirefoxOptions() {
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new FirefoxOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("Firefox Driver couldn't find " + e.getMessage());
        }
        return driver;
    }

    public static WebDriver remoteDriverEdgeOptions() {
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new EdgeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("EDge Driver couldn't find " + e.getMessage());
        }
        return driver;
    }

    public static WebDriver remoteDriverExplorerOptions() {
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), new InternetExplorerOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("Explorer Driver couldn't find " + e.getMessage());
        }
        return driver;
    }

    public static WebDriver setUpRemoteChromeDriver() {
        try {
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setBrowserName("chrome");
            capabilities.setVersion("109.0.5414.120");
            ChromeOptions options = new ChromeOptions();
            options.merge(capabilities);
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.wait(3000);
        } catch (Exception e) {
            System.out.println("Chrome Driver couldn't find " + e.getMessage());
        }
        return driver;
    }

    public static WebDriver setUpRemoteEdgeDriver() {
        try {
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setBrowserName("edge");
            capabilities.setVersion("110.0.1587.30");
            EdgeOptions options = new EdgeOptions();
            options.merge(capabilities);
            driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444"), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        } catch (Exception e) {
            System.out.println("Chrome Driver couldn't find " + e.getMessage());
        }
        return driver;
    }
}

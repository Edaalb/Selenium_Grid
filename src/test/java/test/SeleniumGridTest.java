package test;

import org.testng.annotations.Test;
import utilities.SeleniumGridDrivers;

import static utilities.SeleniumGridDrivers.*;

public class SeleniumGridTest {

    @Test
    public void Test01() {
        remoteDriverChromeOptions().get("https://www.amazon.com");
    }

    @Test
    public void Test02() {
        remoteDriverEdgeOptions().get("https://www.amazon.com");
    }

    @Test
    public void Test03() {
        setUpRemoteChromeDriver().get("https://www.amazon.com");
    }

    @Test
    public void Test04() {
        setUpRemoteEdgeDriver().get("https://www.amazon.com");
    }
}
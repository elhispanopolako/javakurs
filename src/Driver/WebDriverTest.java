package Driver;

public class WebDriverTest {
    public static void main(String[] args) {
       /* ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();
        FirefoxDriver firefoxy = new FirefoxDriver();
        firefoxy.get();
        firefoxy.findElementBy();*/
        WebDriver driver=getDriver("firefox"); {
            driver.get();
            driver.findElementBy();
            driver.findElementBy();
            driver.findElementBy();
            driver.findElementBy();
            driver.findElementBy();

        };
    }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if(name.equals("firefox")){
            return new FirefoxDriver();
        }return null;
    }
}

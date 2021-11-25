package Driver;

import Driver.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce chrome");

    }
}

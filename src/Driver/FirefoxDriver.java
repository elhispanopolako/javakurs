package Driver;

import Driver.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Firefox");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce firefox");
    }
}

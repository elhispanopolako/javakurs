public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes=new Auto("Mercedes","Klasa S",2021,30000);
        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi=new Auto("Audi","A5",2019,50000);
        audi.hamuj();
        audi.jedz();
        audi.info();

    }
}

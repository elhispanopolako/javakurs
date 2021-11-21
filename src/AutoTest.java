public class AutoTest {
    public static void main(String[] args) {
        Auto mercedes=new Auto();
        mercedes.marka="Mercedes";
        mercedes.model="Klasa S";
        mercedes.rok=2021;
        mercedes.przebieg=30000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi=new Auto();
        audi.marka="Audi";
        audi.model="A5";
        audi.rok=2019;
        audi.przebieg=50000;

        audi.hamuj();
        audi.jedz();
        audi.info();

    }
}

package animals;

public class Kot extends Animals{
    @Override
    public void sound() {
        System.out.println("Miau");
        sayHello();
        System.out.println("Ilość nóg: "+legs);
    }
}

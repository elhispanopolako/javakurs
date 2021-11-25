package animals;

public class Dog extends Animals{
    @Override
    public void sound() {
        System.out.println("hau hau");
        sayHello();
        System.out.println("Ilość nóg: "+legs);
    }

}

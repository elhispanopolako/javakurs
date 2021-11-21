public class Calculator {
    public float dod(float firstnumber,float secondnumber){
        System.out.println("Wynik dodawania: "+(firstnumber+secondnumber));
        return firstnumber+secondnumber;
    }
    public float od(float firstnumber,float secondnumber){
        System.out.println("Wynik odejmowania: "+ (firstnumber-secondnumber));
        return firstnumber-secondnumber;
    }
    public float mno(float firstnumber,float secondnumber){
        System.out.println("Wynik mnożenia: "+ (firstnumber*secondnumber));
        return firstnumber*secondnumber;
    }
    public float dzie(float firstnumber,float secondnumber){
        System.out.println("Wynik dzielenia: "+ (firstnumber/secondnumber));
        return firstnumber/secondnumber;
    }
    public float mod(float firstnumber,float secondnumber){
        System.out.println("Wynik modulo: "+ (firstnumber%secondnumber));
    return firstnumber%secondnumber;
    }

}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner pierwszy = new Scanner(System.in),drugi= new Scanner(System.in);
        System.out.println("Podaj Pierwszą liczbę: ");
        float firstnumber = pierwszy.nextInt();
        System.out.println("Podaj Drugą liczbę: ");
        float secondnumber = drugi.nextInt();

        float dodawania =firstnumber+secondnumber;
        System.out.println("Wynik dodawania: "+ dodawania);
        float odejmowanie=firstnumber-secondnumber;
        System.out.println("Wynik odejmowania: "+ odejmowanie);
        float mnozenie= firstnumber*secondnumber;
        System.out.println("Wynik mnożenia: "+ mnozenie);
        float dzielenie= firstnumber/secondnumber;
        System.out.println("Wynik dzielenia: "+ dzielenie);
    }

}

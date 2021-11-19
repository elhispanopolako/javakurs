import java.util.Scanner;

public class InstrukcjaWarunkowaIF {
    public static void main(String[] args) {
        Scanner pierwszy = new Scanner(System.in),drugi= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę a: ");
        float dzielna= pierwszy.nextInt();
        System.out.println("Podaj Drugą liczbę b: ");
        float dzielnik = drugi.nextInt();;
        if (dzielnik !=0) {
            System.out.println("Wynik dzielenia to " + dzielna / dzielnik);
        } else {
            System.out.println("Prosze podaj inna liczbę");
        }
    }
}

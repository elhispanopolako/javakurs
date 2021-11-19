import java.util.Scanner;

public class OperatoryPorównaniaZadanie {
    public static void main(String[] args) {
        Scanner pierwszy = new Scanner(System.in),drugi= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę a: ");
        int firstnumber= pierwszy.nextInt();
        System.out.println("Podaj Drugą liczbę b: ");
        int secondnumber = drugi.nextInt();

        System.out.println("a > b "+(firstnumber>secondnumber));
        System.out.println("a >= b" + (firstnumber>=secondnumber));
        System.out.println("a <=b "+ (firstnumber<=secondnumber));
        System.out.println("a==b " + (firstnumber==secondnumber));
        System.out.println("a!=b "+ (firstnumber !=secondnumber));

    }
}

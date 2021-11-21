import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner pierwszy = new Scanner(System.in), drugi = new Scanner(System.in);
        System.out.println("Podaj Pierwszą liczbę: ");
        float firstnumber = pierwszy.nextInt();
        System.out.println("Podaj Drugą liczbę: ");
        float secondnumber = drugi.nextInt();

        Calculator calculator = new Calculator();

        calculator.dod(firstnumber, secondnumber);
        calculator.od(firstnumber, secondnumber);
        calculator.mno(firstnumber, secondnumber);
        calculator.dzie(firstnumber, secondnumber);
        calculator.mod(firstnumber,secondnumber);
    }
}



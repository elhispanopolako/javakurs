import java.util.Scanner;

public class CustomScaner {
    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = scaner.nextLine();
        System.out.println("Cześć "+name+" "+"!");


            Scanner scanner= new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Liczba to  "+firstNumber+" "+"!");
        }

}

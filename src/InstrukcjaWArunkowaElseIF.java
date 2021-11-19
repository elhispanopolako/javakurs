import java.util.Scanner;

public class InstrukcjaWArunkowaElseIF {
    public static void main(String[] args) {
        Scanner pierwszy=new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number= pierwszy.nextInt();
        if (number==0) {
            System.out.println("Liczba równa 0");
        }else if(number> 10){
                System.out.println("Liczba większa od 10 ");
        }else if(number > 0) {
            System.out.println("Liczba większa od 0,liczba dodatnia");

        }else if (number< -5){
            System.out.println("Liczba mniejsza od -5");
        }else{
            System.out.println("Żaden warunek nie został spełniony");
        }

        }

    }


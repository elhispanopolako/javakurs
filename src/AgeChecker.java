import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner pierwszy=new Scanner(System.in);
        System.out.println("Podaj Wiek: ");
        int wiek= pierwszy.nextInt();

        if (wiek>=18){
            System.out.println("Jesteś pełnoletni, udanych zakupów!");
        }else{
            System.out.println("Jesteś niepełnoletni nie możesz kupić piwa");
        }
    }
}

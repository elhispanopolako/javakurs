import java.util.Scanner;

public class InstukcjaSwitch {
    public static void main(String[] args) {
        Scanner first=new Scanner(System.in);
        System.out.println("Podaj Danie: ");
        String danie= first.nextLine();

        switch(danie) {
            case "pizza":
                System.out.println("Pizza kosztuje 20 zl");
                break;
            case "losos":
                System.out.println("Losos kosztuje 17 zl");
                break;
            case "frytki":
                System.out.println("Frytki kosztuje 7 zl");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
        }
}

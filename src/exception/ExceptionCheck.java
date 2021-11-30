package exception;

import java.util.Scanner;

public class ExceptionCheck {


    public static void main(String[] args) throws InvalidAgeException {
        Scanner scaner=new Scanner(System.in);
        System.out.println("Podaj Wiek: ");
        int wiek= scaner.nextInt();
         if(wiek>=18) {
             System.out.println("Jesteś pełnoletni");
         }else if(wiek<0){
             throw new InvalidAgeException("To jest niemożliwe,twój wiek jest nieprawidłowy!");
         }else{
             System.out.println("Nie jesteś pełnoletni");
         }


    }
}

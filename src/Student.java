public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public static String nazwaUczelni= "AGH";

    public void PrzedstawSie(){
        System.out.println("Nazywam sie " + imie+" "+nazwisko);
    }
   public void ZalogujSie(){
       System.out.println("Loguje sie za pomocą "+ nick);
   }
   public void PodajEmail(){
       System.out.println("Podaj email: "+email );
   }
   public static void infoUczelnia(){
       System.out.println("Moja Uczelnia to: "+nazwaUczelni);
   }
}

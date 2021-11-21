public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;

    public void PrzedstawSie(){
        System.out.println("Nazywam sie " + imie+" "+nazwisko);
    }
   public void ZalogujSie(){
       System.out.println("Loguje sie za pomocą "+ nick);
   }
   public void PodajEmail(){
       System.out.println("Podaj email: "+email );
   }
}

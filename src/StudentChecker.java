public class StudentChecker {
    public static void main(String[] args) {
        Student tadek=new Student();
        String uczelnia=Student.nazwaUczelni;
        Student.infoUczelnia();
        tadek.imie="Tadek";
        tadek.nazwisko="Woźniak";
        tadek.email="wta10@o2.pl";
        tadek.nick="WTA10";

        Student michal=new Student();
         michal.imie="Michał";
         michal.nazwisko="Nowak";
         michal.email="michał@niepodam.pl";
         michal.nick="NMI01";

         Student pati=new Student();
         pati.imie="Patrycja";
         pati.nazwisko="Kużdżał";
         pati.email="patik@niepodam.pl";
         pati.nick="KPA02";

         Student[] students= new Student[3];
         students[0]=tadek;
         students[1]=michal;
         students[2]=pati;

         for(int i=0;i< students.length;i++){
             students[i].PrzedstawSie();
             students[i].PodajEmail();
             students[i].ZalogujSie();
         }

    }
}

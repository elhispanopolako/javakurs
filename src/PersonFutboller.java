public class PersonFutboller extends Persona {
    public String footballClub;
    public PersonFutboller(String name,int age){
        super (name,age);
    }

    public void playFootball(){
        eat();walk();
        System.out.println("Im playing football in "+footballClub);
    }
}

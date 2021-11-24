public class PersonFutboller extends Persona {
    public String footballClub;
    public PersonFutboller(String name,int age,String footballClub){
        super (name,age);
        this.footballClub=footballClub;
    }
    public void eat(){
        System.out.println("I like healthy food! ");
    }

    public void playFootball(){
        System.out.println("Im playing football in "+footballClub);
    }
    public void sayHello(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I am "+ age);
    }
}

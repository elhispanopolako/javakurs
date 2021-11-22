public class PersonTeach extends Persona {
    public String school;
    public PersonTeach(String name,int age) {
        super (name,age);
    }

    public void teachMath(){
        eat();walk();
        System.out.println("I am teaching math");
    }
    public void sayHello(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I am "+ age);
    }
}

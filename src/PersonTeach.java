public class PersonTeach extends Persona {
    public String school;
    public PersonTeach(String name,int age,String school) {
        super (name,age);
        this.school=school;
    }
    public void walk(){
        System.out.println("I walk very fast");
    }

    public void teachMath(){
        System.out.println("I am teaching math in " + school);
    }
    public void sayHello(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I am "+ age);
    }
}

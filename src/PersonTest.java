public class PersonTest {
    public static void main(String[] args) {
        PersonTeach teacher=new PersonTeach("Tom",29,"WSIZ");
        teacher.sayHello();
        teacher.teachMath();
        teacher.eat();
        teacher.walk();



        PersonFutboller futboller=new PersonFutboller("Frank",20,"Chelsea");
        futboller.sayHello();
        futboller.playFootball();
        futboller.walk();
        futboller.eat();
    }
}

public class PersonTest {
    public static void main(String[] args) {
        PersonTeach teacher=new PersonTeach("Tom",29);
        teacher.name="Tom";
        teacher.age=29;
        teacher.school="University";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();


        PersonFutboller futboller=new PersonFutboller("Frank",20);
        futboller.name="Frank";
        futboller.age=20;
        futboller.footballClub="Chelsea";
        futboller.playFootball();
        futboller.walk();
        futboller.eat();
    }
}

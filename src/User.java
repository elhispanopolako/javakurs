public class User {
    public String username;
    public String password;
    public User(String user,String pass){
        System.out.println("Hello z kostruktora");
        username=user;
        password=pass;
    }
    public void sayHello(){
        System.out.println("Hello my name is "+username);
    }
}

package identifiers.first;

public class Base {
    public String first="public";
    String second="default";
    protected String third="protected";
    private String four="private";

    public void firstmethod(){
        System.out.println("public");
    }
    public void secondmethod(){
        System.out.println("default");
    }
    public void thirdmethod(){
        System.out.println("protected");
    }
    public void fourthmethod(){
        System.out.println("private");
    }
    public void testidentyfi(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);
        firstmethod();
        secondmethod();
        thirdmethod();
        fourthmethod();
    }


}

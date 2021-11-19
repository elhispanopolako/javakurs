public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstvalue =true;
        boolean secondvalue=false;
        boolean thirdvalue=false;
        boolean fourthvalue=true;

        System.out.println(firstvalue&&secondvalue);//&& daje true kiedy wartość jest taka sama
        System.out.println(firstvalue&&fourthvalue);

        System.out.println(firstvalue||secondvalue);// || lub wystarczy jedno true
        System.out.println(thirdvalue||secondvalue);

        System.out.println(!firstvalue);//!-negacja
        System.out.println(!(firstvalue&&secondvalue));
    }
}

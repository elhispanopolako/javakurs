import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Tablica {
    public static void main(String[] args) {
        String[] imiona=new String [3];
        imiona[0]="Bartek" ;
        imiona[1]="Basia";
        imiona[2]="Tadek";
       System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
        for (int i=0; i< imiona.length; i++)
            System.out.println(imiona[i]);
    }

}

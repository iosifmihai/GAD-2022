package Lab2.ch2;

public class Main {
    public static void main(String[] args)
    {
        ;
        Premiu pr1 = new Premiu("oscar",2003);
        Premiu[] listapremii= new Premiu[]{pr1};
        Actor ac1 = new Actor("Actor2",20,listapremii);
        //Film f1 = new Film("Spiderman",2002,);
        //Studio st1= new Studio("Studio1",[f1]);

        System.out.println(ac1);
    }
}

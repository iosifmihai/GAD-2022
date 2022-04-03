package Lab1.ch2;

public class compute {

     static String com(int a)
    {

        while(a!=0)
        {   int x;
            int aux=a;
            if(aux%3==0)
            {

                System.out.print("Foo");
            }

            if(aux%5==0)
            {

                 System.out.print("Bar");
            }

            if(aux%7==0)
            {

                System.out.print("Qix");
            }
           x=a%10;
           if(x==3)
           {

               System.out.print("Foo");
           }
           if(x==5)
           {

               System.out.print("Bar");
           }
           if(x==7)
           {

               System.out.print("Qix");
           }
           a/=10;
        }


        return null;
    }

    static String com2(int a) {
        int y;

        while (a != 0) {
            y = a % 10;
            if (y == 0) {
                System.out.print("*");
            }
            if (y != 0) {
                System.out.print(y);
            }

            a /= 10;


        }
        return null;
    }


}

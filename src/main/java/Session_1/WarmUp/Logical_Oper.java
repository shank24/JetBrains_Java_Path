package JetBrains_Academy.Session_1;

public class Logical_Oper {

    public static void main(String[] args) {

/*
        boolean a = true;
        boolean b = false;

        System.out.println(a || b);
        System.out.println(!a || b);
        System.out.println(!a || !b);
        System.out.println(!a || b);

        System.out.println("Negation of Logical OR");
        //
        System.out.println(!(a || b));
        System.out.println(!(!a || b));
        System.out.println(!(!a || !b));
        System.out.println(!(!a || b));
*/


        boolean b1 = true;
        boolean b2 = true;
        System.out.println(b1 || !!b2);

        System.out.println(!b1 && b2);

        System.out.println(!b1 || b2);

        //Correct
        System.out.println(!(b1 || b2));
        System.out.println(!b1 && !b2);



    }
}

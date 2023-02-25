package Chuck_Norris_Cipher_Encoder.Problems.General;

public class IfToSwitch {
    public static void main(String[] args) {

        int val =4;

        if (val == 1) {
            System.out.println("ONE");
        } else if (val == 2) {
            System.out.println("TWO");
        } else if (val == 3){
            System.out.println("THREE");
        } else {
            System.out.println("UNKNOWN NUMBER");
        }


        switch (val) {
            case 1: System.out.println("ONE");
                break;
            case 2: System.out.println("TWO");
                break;
            case 3: System.out.println("THREE");
                break;
            default: System.out.println("UNKNOWN NUMBER");
        }

        switch (val) {
            case 1: System.out.println("ONE");
                break;
            case 2: System.out.println("TWO");
                break;
            case 3: System.out.println("THREE");
                break;
            case 4: System.out.println("UNKNOWN NUMBER");
                break;
            default: System.out.println("UNKNOWN NUMBER");
        }
    }
}

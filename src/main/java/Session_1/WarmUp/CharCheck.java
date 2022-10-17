package JetBrains_Academy.Session_1;

public class CharCheck {
    public static void main(String[] args) {

        char ch = 'e';

        ch -= 'a';
        System.out.println(ch);
        ch++;
        ch += 'b';
        System.out.println(ch);

        char ch1 = '\u0031' + '\u0035';
        System.out.println(ch1);

    }
}


package WarmUp;

public class WhileDemo {

    public static void main(String[] args) {

        printChars();
    }

    private static void printChars() {
        char letter = 'A';
        while(letter <= 'Z'){
            System.out.print(letter);
            letter++;
        }
    }
}

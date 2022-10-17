package Session_2.Warmup;

public class WhileSnippet {
    public static void main(String[] args) {
        int n = 12345;

        int magic = 0;
        while(n > 0) {
            n /= 10;
            magic++;
        }
        System.out.println(magic);
    }
}

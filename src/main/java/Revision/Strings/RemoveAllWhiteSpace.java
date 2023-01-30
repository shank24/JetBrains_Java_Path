package Revision.Strings;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String input= "Geeks Gor Geeks";

        System.out.println(removeAllWhiteSpace(input));
    }

    private static String removeAllWhiteSpace(String input) {
        return input.replaceAll("\\s","");
    }
}

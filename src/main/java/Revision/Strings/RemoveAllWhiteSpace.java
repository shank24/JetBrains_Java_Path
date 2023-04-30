package Revision.Strings;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();

        System.out.println(removeAllWhiteSpace(str));
    }

    private static String removeAllWhiteSpace(String input) {
        StringUtilsMethod.nullStrCheck(input);
        return input.replaceAll("\\s","");
    }
}

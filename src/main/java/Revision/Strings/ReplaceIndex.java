package Revision.Strings;

public class ReplaceIndex {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        int index = 6;
        char ch = 'F';
        System.out.println(replaceIndex(str, ch, index));
    }

    private static String replaceIndex(String value, char ch, int index) {
        StringUtilsMethod.nullStrCheck(value);

        return value.substring(0,index)+ch+value.substring(index+1);
    }
}
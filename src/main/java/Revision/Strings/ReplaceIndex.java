package Revision.Strings;

public class ReplaceIndex {
    public static void main(String[] args) {
        String value = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';
        System.out.println(replaceIndex(value, ch, index));
    }

    private static String replaceIndex(String value, char ch, int index) {
        if (value.length() <= 0) {
            return null;
        }

        return value.substring(0,index)+ch+value.substring(index+1);
    }
}
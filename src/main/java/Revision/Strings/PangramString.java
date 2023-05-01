package Revision.Strings;

public class PangramString {
    public static void main(String[] args) {
        String str = StringUtilsMethod.InputString();
        isStrPangram(str);

    }

    private static void isStrPangram(String str) {
        StringUtilsMethod.nullStrCheck(str);
        String strLowerCase = str.toLowerCase();

        boolean allLetterPresent = true;

        for (char ch = 'a'; ch <='z' ; ch++) {
            if (!strLowerCase.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        if(allLetterPresent)
            System.out.println("Panagram String");
        else
            System.out.println("Not a PS");
        }


}

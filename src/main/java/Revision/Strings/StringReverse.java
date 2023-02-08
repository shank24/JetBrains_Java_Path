package Revision.Strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ABC";
        getReverse(str);
        getReverseWithoutMethod(str);
    }

    private static void getReverseWithoutMethod(String str) {

        char ch[] = str.toCharArray();
        String nstr="";

        for (int i = ch.length-1; i >=0; i--) {
            nstr = nstr+ch[i];
        }
        System.out.println(nstr);
    }

    private static void getReverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}

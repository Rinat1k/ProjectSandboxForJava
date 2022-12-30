package javacourses.homework17;

public class StringBuilderEqual {

    public boolean equal(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length()==sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i)!=sb2.charAt(i)) return false;
            }
        } else return false;
        return true;
    }

}

class Program {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("String hello");
        StringBuilder sb2 = new StringBuilder(" String hello");
        System.out.println(new StringBuilderEqual().equal(sb1, sb2));
    }
}

public class Slogan {
    public static void main(String[] args) {
        String slogan = "창의와 나눔으로 세상에 힘이 되는 한양";
        System.out.println(slogan);
        System.out.println(slogan.length());
        String slogan2 = "   " + slogan + "   ";
        System.out.println(slogan2 + "!");
        System.out.println(slogan2.length());
        String slogan3 = slogan2.trim();
        System.out.println(slogan3 + "!");
        System.out.println(slogan);
        System.out.println(slogan3);
        System.out.println(slogan == slogan3);
        System.out.println(slogan.equals(slogan3));
        System.out.println(slogan.charAt(5));
        System.out.println(slogan.substring(4,6));
        String slogan_E = "Hanyang: Ancient Capital, Modern Academics";
        System.out.println(slogan_E.toUpperCase());
        System.out.println(slogan_E.toLowerCase());
        System.out.println(slogan_E.indexOf("a"));
        System.out.println(slogan_E.indexOf("a",2));
        System.out.println("a".compareTo("c"));
        System.out.println("C".compareTo("A"));
    }
}

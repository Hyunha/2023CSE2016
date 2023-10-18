package indefinite;

public class TextSearchWhile {
    /* findChar - 문자열에서 가장 먼저 나타나는 문자를 검색
     * @param c - 검색할 문자
     * @param s - 검색 대상 문자열
     * @return - s에서 가장 먼저 나타나는 문자 c의 인덱스;  없으면 -1 */
    public int findChar(char c, String s) {
        boolean found = false;
        int index = 0;
        while (!found && index < s.length()) {
            // loop invariant:
            // (1) found == false : s[0], .., s[index-1]은 모두 c가 아님
            // (2) found == true : s.charAt(index) == c
            if (s.charAt(index) == c)
                found = true;
            else
                index = index + 1;
        }
        if (!found)
            index = -1;
        return index;
    }
    public static void main(String[] args) {
        TextSearchWhile text_search = new TextSearchWhile();
        System.out.println(text_search.findChar('a', "Hanyang"));
        System.out.println(text_search.findChar('e', "Hanyang"));
    }
}

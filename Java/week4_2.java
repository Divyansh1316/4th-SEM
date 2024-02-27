public class week4_2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("graphic era university");
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) == 'a' || sb1.charAt(i) == 'A' || sb1.charAt(i) == 'e' || sb1.charAt(i) == 'E'
                    || sb1.charAt(i) == 'i' || sb1.charAt(i) == 'I'
                    || sb1.charAt(i) == 'o' || sb1.charAt(i) == 'O' || sb1.charAt(i) == 'u' || sb1.charAt(i) == 'U') {
                sb1.delete(i, i + 1);
            }
        }
        System.out.println(sb1);
    }
}

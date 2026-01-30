public class DebugLab2 {
    public static void main(String[] args) {
        String word = "metamorphosis";
        int i = 0;
        while(i < word.length() - 1) {
            String letter = word.substring(i, i + 1);
            if (letter.equals("m")) {
                i += 2;
            } else if (letter.equals("i")) {
                i += 3;
            }
            i++;
        } 
    }
}

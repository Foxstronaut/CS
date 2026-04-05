public class DebugLab2 {

    public static void main(String[] args) {
        // Calling the method as requested
        count(12);
    }

    public static void jumpAndHop(String word) {
        int i = 0;
        while (i < word.length() - 1) {
            String letter = word.substring(i, i + 1);
            if (letter.equals("m")) {
                i += 2;
            } else if (letter.equals("i")) {
                i += 3;
            }
            i++;
        }
    }

    public static void count(int num) {
        int i = 1;
        System.out.println("Begin: ");
        while(i <= num) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n... ...end... ... ");
    }
}
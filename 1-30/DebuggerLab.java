public class DebuggerLab {
    public static void main(String[] args) {
        String word1 = "Java";
        String reversed = "";

        // Goal: Reverse the string so it prints "avaJ"
        for (int i = word1.length() - 1; i >= 0; i--) {
            reversed = reversed + word1.charAt(i);
        }

        System.out.println("Result: " + reversed);
    }
}
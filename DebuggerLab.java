public class DebuggerLab {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";

        // Goal: Reverse the string so it prints "avaJ"
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Result: " + reversed);
    }
}
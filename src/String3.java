import java.util.regex.Pattern;

public class String3 {

    static String name = "John";
    static String username = "s20surname";
    static String personCodeOfLatvian = "121200-11311";

    static boolean onlyLettersPattern() {
        return Pattern.matches("[a-zA-Z]+", name);
    }

    static boolean usernamePattern() {
        return Pattern.matches("^[a-zA-Z][0-9]{2}[a-zA-Z]+", username);
    }

    static boolean personCodePattern() {
        return Pattern.matches("^[0-9]{6}[-][0-9]{5}$", personCodeOfLatvian);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("This string contains only letters: " + onlyLettersPattern());
        System.out.println("The username pattern is correct: " + usernamePattern());
        System.out.println("The person code is written correctly " + personCodePattern());
        System.out.println();
    }
}
import java.util.Arrays;

public class String2 {

    static String myString = "Climb mountains not so the world can see you, but so you can see the world";
    static int counter;
    static String[] myStringArray;

    static void stringArray() {
        myStringArray = myString.split("\\W+");
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(myStringArray.length);
    }

    static void countThe() {
        counter = 0;
        for (String the : myStringArray) {
            if (the.equals("the")) {
                counter++;
            }
        }
        System.out.printf("We have %d 'the' words in this sentence \n", counter);
    }

    static void countS() {
        counter = 0;
        for (String s : myStringArray) {
            if (s.contains("s")) {
                counter++;
            }
        }
        System.out.printf("%d words contain letter 's' \n", counter);
    }

    static void repeatingWords() {
        System.out.println("Repeating words:");
        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = i + 1; j < myStringArray.length; j++) {
                if (myStringArray[i].equals(myStringArray[j])) {
                    System.out.println(myStringArray[j]);
                }
            }
        }
    }

    static void replace() {
        for (int i = 0; i < myStringArray.length; i++) {
            myStringArray[i] = myStringArray[i].replace("you", "You");
        }
        System.out.println(Arrays.toString(myStringArray));
    }


    public static void main(String[] args) {
        stringArray();
        countThe();
        countS();
        repeatingWords();
        replace();
    }
}

import java.util.Arrays;

public class String1 {

    static String[] strArray = {"Computer", "Plate", "Chair", "Girl", "Boy",
            "Cat", "Dog", "Shirt", "Determination"};

    public static void startsWithC() {

        int counter = 0;
        for (String s : strArray) {
            if (s.startsWith("C")) {
                counter++;
            }
        }
        System.out.printf("We have %d words starting with 'C' \n", counter);
    }

    public static void endsWithE() {

        int counter = 0;
        for (String s : strArray) {
            if (s.endsWith("e")) {
                counter++;
            }
        }
        System.out.printf("We have %d words ending with 'e'\n", counter);
    }

    public static void lengthFive() {

        int counter = 0;
        for (String s : strArray) {
            if (s.length() == 5) {
                counter++;
            }
        }
        System.out.printf("We have %d words that are with length five\n", counter);

    }

    public static void containE() {

        int counter = 0;
        for (String s : strArray) {
            if (s.contains("e")) {
                counter++;
            }
        }
        System.out.printf("We have %d words having 'e' in them\n", counter);

    }

    public static void containTE() {

        int counter = 0;
        for (String s : strArray) {
            if (s.contains("te")) {
                counter++;
            }
        }
        System.out.printf("We have %d words having 'te' in them\n", counter);
    }

    public static void histogram() {

        int[] newArray = new int[14];
        for (int i = 0; i < newArray.length; i++) {
            int counter = 0;
            for (String str : strArray) {
                if (i == str.length()) {
                    counter++;
                }
            }
            newArray[i] = counter;
            System.out.println(newArray[i] + " values have length of " + i + " elements");
        }
    }

    public static void main(String[] args) {
        System.out.println("This ir our array of strings: " + Arrays.toString(strArray));
        startsWithC();
        endsWithE();
        lengthFive();
        containE();
        containTE();
        histogram();
    }
}


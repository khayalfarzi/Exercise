public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println(displayMiddleChar("12345678"));
        System.out.println(vowelCounter("Hello World"));
        System.out.println(checkNum(2468));


    }

    static StringBuilder displayMiddleChar(String str) {
        int length = str.length();//salam 5  2.5
        StringBuilder result = new StringBuilder();

        if (length % 2 == 0) {

            for (int i = length / 2 - 1; i < length / 2 + 1; i++) {
                result.append(str.charAt(i));

            }


        } else {

            result.append(str.charAt((length / 2)));
        }

        return result;
    }

    static int vowelCounter(String str) {

        String vowel = "aeuio";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e') {
                count++;

            }
        }
        return count;
    }

    public static boolean checkNum(int a) {
        int count1 = 0, count2 = 0;
        int dig = 0;
        while (a > 0) {
            dig++;
            if ((a % 10) % 2 == 1) {
                return false;
            }
        }
        return true;


    }
}

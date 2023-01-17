package Java_Practice;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "Cydeo";

        char ch = str.charAt(1);

        int length = str.length();

        System.out.println(ch);
        System.out.println(length);

        int lastIndex = str.length() - 1;

        char ch2 = str.charAt(lastIndex);

        System.out.println(ch2);

        int indexofE = str.indexOf('e');

        System.out.println("indexofE = " +indexofE);

        int indexofFirsto = str.indexOf('o');
        System.out.println("indexofFirsto = " +indexofFirsto);





    }
}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */

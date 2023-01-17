package Java_Practice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String  letters = "AAABBBCCC";

        int originalLength = letters.length();

       // System.out.println(letters);

        String temp = letters.replace("AAABBBCCC", "ABC");

        int newLength = temp.length();

        System.out.println(temp);


    }
}

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */

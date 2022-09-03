package pl.klemi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userType;
        String reverse = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Plese type a number ?");
        userType= in.nextLine();

        int lenght = userType.length();
        for (int i=lenght-1 ; i>=0; i--)
            reverse = reverse + userType.charAt(i);

        if (userType.equals(reverse))
            System.out.println("Entered number is a palindrome");
        else
            System.out.println("Enternd number isn't palindrome");

    }
}

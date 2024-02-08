import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st : ");
        String s1 = sc.next();
        System.out.println("2nd : ");
        String s2 = sc.next();
        char[] c1 = new char[s1.length()]; 
        char[] c2 = new char[s2.length()];
        c1 = s1.toCharArray();
        c2 = s2.toCharArray(); 
        Arrays.sort(c1); 
        Arrays.sort(c2); 
        if (Arrays.equals(c1, c2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("Nahh");
        }
    }
}

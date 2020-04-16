import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int a = A.length();
        int b = B.length();
        System.out.println(a+b);

        int i = A.compareTo(B);
        if(i>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capa = A.substring(0,1).toUpperCase()+A.substring(1);
        String capb = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(capa+" "+capb);
    }
}


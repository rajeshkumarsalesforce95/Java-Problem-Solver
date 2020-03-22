/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrankchallenges;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StringsLexicographicallyExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length=A.length() + B.length();
        System.out.println(length);
        if(A.compareTo(B) < 0)
        {
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        else if (A.compareTo(B)==0)
        {
            System.out.println("No");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        else
        {
            System.out.println("Yes");
            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
            System.out.println(A + " " + B);
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.project;



/**
 *
 * @author sita
 */
import java.util.Scanner;
public class Cal {
    private static int ch;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
    char vowel;
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter alphabet:" );     
        vowel=sc.next().charAt(0);

    switch (vowel){    
        case 'a':     
        case 'A':     
        case 'e':     
        case 'E':     
        case 'i':     
        case 'I':     
        case 'o':     
        case 'O':     
        case 'u':     
        case 'U':    
           System.out.println("This is a Vowel:"+ vowel);
           break;
        default:
           System.out.println("This is consonant:"+ vowel);
           break;

        }
    } 
}

       
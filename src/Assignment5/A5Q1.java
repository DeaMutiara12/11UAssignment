/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

 
 /**
 *
 * @author Donald
 */

 
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner (System.in);
        
        //ask for a word to translate
        System.out.println("Enter a word that you would like to translate: ");
        String word = input.nextLine ();
        
        //convert word to lowercase
        word= word.toLowerCase();
        
        //translate word
        String translated = "";
        for (int i= 0; i< word.length(); i++){
        
        //search for a vowel 
        if (word.charAt(i)== 'a' || word.charAt(i)== 'e' || word.charAt(i) == 'o' || word.charAt(i)== 'i' || word.charAt(i)=='u' ){
           boolean foundVowel = false;
         //add the "ub"
         translated = word+ "ub" + word.charAt(i);
             foundVowel = true; 
        }else{
            //add ub
            System.out.println (word +"ub"+ translated+ "ub");
           
            
            
            
            }
        }
            
        
        }
           
        }
    



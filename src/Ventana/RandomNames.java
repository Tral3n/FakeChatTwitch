package Ventana;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Random;

public class RandomNames {
    
       public String Generar(){
    String letrasN = "aeiouqwrtysdfghjklzxcvbnm";

        String randomString = "";
        int min = 3;
        int max = 10;
        int length = (int) (Math.random() * (max - min + 1) + min);

        Random random = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = letrasN.charAt(random.nextInt(letrasN.length()));

        }
        for (int i = 0; i < text.length; i++) {
            randomString += text[i];

        }
     
      return randomString;
    }
      
    
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.t03;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class palin {
    public static void Palindromo () {
        Scanner s = new Scanner (System.in);
        System.out.print("escriba el palindromo: ");
        String p = s.nextLine();
        p = p.toLowerCase();
        p = p.replace(" ", "");
        p = p.replace(",", "");
        p = p.replace(".", "");
        char paa[] = p.toCharArray();
        char pl[] = new char [paa.length];
        int c = 0;
        for(int i = paa.length - 1, j = 0; j < paa.length; i--, j++){
            pl[j] = paa[i];
        }
        for (int i = 0; i< paa.length; i++) {
            if (paa[i]==pl[i]){
                c++;
            }
        }
        for (int i = 0; i < paa.length; i++){
            System.out.print(paa[i] + " ... " + pl[i] + ", ");
        } System.out.println("");
        if (paa.length == c) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.t03;

/**
 *
 * @author casa
 */
public class EDIRochaT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        contacto contact = new contacto("francisco",123456789);
        stackclass mystack = new stackclass();
        mystack.push(contact);
        mystack.push(10);
        mystack.showstack();
        
        mystack.push(10);
        mystack.showstack();
        palin.Palindromo();
    }
}

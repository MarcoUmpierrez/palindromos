/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

/**
 *
 * @author usuario
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analizador prueba = new Analizador();
        if(prueba.esPalindromo(12321))
            System.out.println("Es palíndromo\n");
        else
            System.out.println("No es palíndromo\n");
    }
}

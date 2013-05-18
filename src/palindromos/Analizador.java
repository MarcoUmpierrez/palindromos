/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromos;

/**
 *
 * @author usuario
 */
class Analizador {

    boolean esPalindromo(int i) {
        if(PalindromoUnaCifra(i))
            return true;
        return false;
    }

    private boolean PalindromoUnaCifra(int i) {
        if(i<10 && i>0)
            return true;
        else
            return false;
    }
    
}

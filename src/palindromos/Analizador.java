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

    boolean esPalindromo(int ValorEvaluado) {
        if(esPalindromoUnaCifra(ValorEvaluado))
            return true;
        if(esPalindromoMayorDeUnaCifra(ValorEvaluado))
            return true;
        return false;
    }

    private boolean esPalindromoUnaCifra(int ValorEvaluado) {
        if(ValorEvaluado<10 && ValorEvaluado>0)
            return true;
        else
            return false;
    }

    private boolean esPalindromoMayorDeUnaCifra(int ValorEvaluado) {
        String PalindromoConvertidoAString;
        int LongitudPalindromo;
        PalindromoConvertidoAString = String.valueOf(ValorEvaluado);        
        LongitudPalindromo = PalindromoConvertidoAString.length();        
        for(int i=0;i<(LongitudPalindromo/2);i++)
        {   
              if(PalindromoConvertidoAString.charAt(i) != PalindromoConvertidoAString.charAt(LongitudPalindromo-(i+1)))
                return false;
        }
        return true;
    }
    
}

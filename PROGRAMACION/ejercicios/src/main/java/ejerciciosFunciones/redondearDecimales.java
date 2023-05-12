
package ejerciciosFunciones;

/**
 *
 * @author Admin
 */
public class redondearDecimales {
    
    /**
     * Redondea a dos decimales un double.
     * @param numeroLargoConMuchosDecimales
     * @return 
     */
    public double numRedondeado(double numeroLargoConMuchosDecimales){
        return Math.round(numeroLargoConMuchosDecimales * 100.0) / 100.0;
    }
    
    
    public static void main(String[] args) {
        
    }
}

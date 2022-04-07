/**
 * 
 */
package paquete;
import paquete.Operaciones;

/**
 * @author Daniel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int suma, resta;
		
		Operaciones v1 = new Operaciones(); 
		suma = v1.sumar(9, 8);
		resta = v1.restar(10, 5);
		
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);

	}

}

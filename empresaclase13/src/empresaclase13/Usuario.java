package empresaclase13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 * @author Luis Zenteno - Barbara Carvajal - Maria Fernanda
 * @version 1.0
 * 
 * Esta clase utilizara los siguientes parametros para cada metodo:
	 * @param mensaje se muestra al usuario para solicitar el ingreso del valor que guardará cada atributo.
	 * @param sc Scanner para la entrada de datos por parte del usuario.
	 * @return La cadena de caracteres correspondiente al valor ingresado, validado y asignado a cada atributo.
 */
public class Usuario{
	
	private String nombre, fechaNac, rut;
	
	/*Constructor vacío de la clase Usuario. Crea una nueva instancia de la clase Usuario*/
	public Usuario() {}
	
	/**
	Método toString sobreescrito para la clase Usuario.
	Devuelve una representación en forma de cadena de los valores de los atributos de un objeto de la clase Usuario.
	@return Una cadena con los valores de los atributos de los usuarios.
	*/
	@Override
	public String toString() {
		return "\nDATOS USUARIO" + "\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n" + "\n* NOMBRE --> " + nombre + "\n* FECHA NACIMIENTO --> "
				+ fechaNac + "\n* RUT  --> " + rut;
	}
	
	/**
	 * Metodo que valida el formato de un input, que será utilizado para validar Nombres, Apellidos y otros atributos con las mismas caracteristicas.
	 */
	public String validarLetras(String mensaje, Scanner sc) {

		boolean condicion = true;
		String entrada = "";

		while (condicion) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-zA-Z\\s]{1,}")) {

				condicion = false;
			} else {

				System.out.println("Dato ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * Método que valida el formato del RUN ingresado por el usuario.
	 */
	public String validarRun(String mensaje, Scanner sc) {

		boolean condRun = true;
		String entrada = "";

		while (condRun) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("\\d{2}.\\d{3}.\\d{3}")) {

				condRun = false;
			} else {

				System.out.println("Run ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * Metodo que valida la fecha con el uso de la clase SimpleDateFormat en formato dd-mm-yyyy
	 */
	public String validarFecha(String mensaje, Scanner sc) {
		
		boolean condFecha = true;
		String entrada = "";
		
		while(condFecha) {
			
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
			
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	        format.setLenient(false); // establecer en falso para validación estricta

	        try {
	            format.parse(entrada);
	            condFecha = false;
	            
	        } catch (ParseException e) {
	            System.out.println(entrada + " no es una fecha válida, intentalo nuevamente");
	        }
		}
		return entrada;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	
}

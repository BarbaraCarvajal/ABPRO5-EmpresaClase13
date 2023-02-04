package empresaclase13;

import java.util.Scanner;

/**
 * @author Luis Zenteno, Barbara Carvajal, María-Fernanda Villalobos
 * @version 1.0
 * 
 * Esta clase utilizara los siguientes parametros para cada metodo:
	 * @param mensaje se muestra al usuario para solicitar el ingreso del valor que guardará cada atributo.
	 * @param sc Scanner para la entrada de datos por parte del usuario.
	 * @return La cadena de caracteres correspondiente al valor ingresado, validado y asignado a cada atributo.
 */
public class Cliente {

	public Cliente() {
	}

	private String rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad;

	@Override
	public String toString() {
		return "\nDATOS CLIENTE" + "\n\\\\\\\\\\\\\\\\" + "\n* NOMBRES --> " + nombres + "\n* APELLIDOS --> "
				+ apellidos + "\n* RUT  --> " + rut + "\n* EDAD --> " + edad + " años" + "\n* TELÉFONO --> " + " +56 9 "
				+ telefono + "\n* AFP -->  " + afp + "\n* SISTEMA SALUD --> " + sistemaSalud + "\n* DIRECCIÓN --> "
				+ direccion + "\n* COMUNA --> " + comuna;
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
	 *Metodo que valida el formato del número de telefono, correspondiente a 8 digitos.
	 */
	public String validarTelefono(String mensaje, Scanner sc) {

		boolean condTel = true;
		String entrada = "";

		while (condTel) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[0-9]{8}")) {

				condTel = false;
			} else {

				System.out.println("Número de telefono no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 *Metodo que valida el formato del Sistema de salud, teniendo una variable que puede almacenar dos opciones solamente.
	 */
	public String validarSalud(String mensaje, Scanner sc) {

		boolean condSalud = true;
		String entrada = "fonasa";

		while (condSalud) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine().toLowerCase();

			if (entrada.matches("[a-z]+")) {

				if (entrada.equals("fonasa") || entrada.equals("isapre")) {
					condSalud = false;
				} else {
					System.out.println("Sistema de salud no existente, intentalo nuevamente");
				}

			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * Valida el formato de la edad ingresada, solo se aceptan tipos númericos con una longitud de uno o dos digitos.
	*/
	public String validarEdad(String mensaje, Scanner sc) {

		boolean condEdad = true;
		String entrada = "";

		while (condEdad) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[0-9]{1,2}")) {

				if (!entrada.equals("0")) {

					condEdad = false;
				} else {

					System.out.println("La edad no puede ser 0, intentalo nuevamente");
				}
			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
			}

		}
		return entrada;
	}
	
	/**
	 * El método toma un mensaje y un objeto Scanner como entradas, y solicita al usuario que ingrese su dirección.
	 * Luego se valida la dirección ingresada para asegurarse de que tenga entre 5 y 50 caracteres y solo contenga letras, números y espacios.
	 * Si la dirección ingresada no es válida, se solicita al usuario que ingrese una nueva dirección.
	 * El método devuelve la dirección válida.
	 */
	public String validarDireccion(String mensaje, Scanner sc) {

		boolean condicion2 = true;
		String entrada = "";

		while (condicion2) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-z A-Z 0-9]{5,50}")) {

				condicion2 = false;
			} else {

				System.out.println("Direccion ingresada no valida, intentelo nuevamente");
			}
		}
		return entrada;
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

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @return the sistemaSalud
	 */
	public String getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

}
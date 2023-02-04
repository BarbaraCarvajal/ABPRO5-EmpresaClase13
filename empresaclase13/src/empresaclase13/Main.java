/**
 * 
 */
package empresaclase13;
import java.util.Scanner;
/**
 * @author Luis Zenteno, Barbara Carvajal, María-Fernanda Villalobos
 */

/**
 * @author Luis Zenteno
 * @version 1.0
 */
public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void claseCapacitacion() {

		//Creación de un objeto de la clase Capacitación
		Capacitacion cap1 = new Capacitacion();

		System.out.println("\nFORMULARIO DE CAPACITACIÓN");

		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		cap1.setIdentificador(cap1.validarId("\nIngresa un ID (5 a 8 cáracteres) --> ", sc));
		cap1.setRut(cap1.validarRun("Ingresa el rut de Cliente (99.999.999) --> ", sc));
		cap1.setDia(cap1.validarDia("Ingrese el día de la capacitación --> ", sc).toLowerCase());
		cap1.setHora(cap1.validarHora("Ingresa la hora de la capacitación (hh:mm) --> ", sc));
		cap1.setLugar(cap1.validarLugar("Ingresa el lugar de la capacitación --> ", sc).toLowerCase());
		cap1.setDuracion(cap1.validarDuracion("Ingresa la duración de la capacitacion en horas --> ", sc));
		cap1.setCantAsistentes(cap1.validarAsistentes("Ingresa la cantidad de asistentes (max 999) --> ", sc));
		cap1.setNumeroInterno(cap1.validarNumeroInterno("Ingrese el numero interno (3-5 digitos)", sc));
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(cap1.toString());

	}

	public static void claseCliente() {
		
		//Creación de un objeto de la clase Cliente.
		Cliente cliente1 = new Cliente();

		System.out.println("\nFORMULARIO DE CLIENTES");
		
		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		cliente1.setNombres(cliente1.validarLetras("\nIngresa tus nombres --> ", sc).toLowerCase());
		cliente1.setApellidos(cliente1.validarLetras("Ingresa tus apellidos --> ", sc).toLowerCase());
		cliente1.setRut(cliente1.validarRun("Ingresa tu rut (99.999.999) --> ", sc));
		cliente1.setEdad(cliente1.validarEdad("Ingresa tu edad --> ", sc));
		cliente1.setTelefono(cliente1.validarTelefono("Ingresa tu número de teléfono (8 digitos) --> ", sc));
		cliente1.setAfp(cliente1.validarLetras("Ingresa tu AFP --> ", sc).toLowerCase());
		cliente1.setSistemaSalud(cliente1.validarSalud("Ingresa tu Sistema de Salud (fonasa - isapre) --> ", sc).toLowerCase());
		cliente1.setDireccion(cliente1.validarDireccion("Ingresa tu dirección --> ", sc).toLowerCase());
		cliente1.setComuna(cliente1.validarLetras("Ingresa tu Comuna de residencia --> ", sc).toLowerCase());
		
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(cliente1.toString());
	}

	public static void claseUsuario() {
		
		//Creación de un objeto de la clase Usuario.
		Usuario user1 = new Usuario();
		
		System.out.println("\nFORMULARIO DE USUARIOS");
		
		//Llamado a método para validar los datos de la capacitación y asignación del resultado.
		user1.setNombre(user1.validarLetras("\nIngresa el nombre del usuario --> ", sc).toLowerCase());
		user1.setRut(user1.validarRun("Ingresa tu rut (99.999.999) --> ", sc));
		user1.setFechaNac(user1.validarFecha("Ingresa tu fecha de nacimiento (dd-mm-yyyy) --> ", sc));
		
		// Entrega un detalle de los datos ingresados por el usuario
		System.out.println(user1.toString());
		}
	
	
	
	/**
	 * @param args
	 *
	 * Clase principal del programa.
	 * Este programa llama a tres métodos: claseCliente(), claseCapacitacion() y claseUsuario().
	 * Imprime separadores antes y después de cada llamado de método.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n-------------------------------");
		claseCliente();
		System.out.println("\n-------------------------------");
		claseCapacitacion();
		System.out.println("\n-------------------------------");
		claseUsuario();
		System.out.println("\n-------------------------------");

	}
}